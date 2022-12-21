package org.example.utilities;

import org.example.pages.CartPage;
import org.example.pages.LandingPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CartPageTest {
    WebDriver driver;
    ProductsPage productsPage;
    LandingPage landingPage;
    CartPage cartPage;

    @BeforeClass
    public void setup() {
        driver = WebDriverUtility.getDriver();
        driver.manage().window().maximize();
        this.cartPage = new CartPage(driver);
        this.productsPage = new ProductsPage(driver);
        this.landingPage = new LandingPage(driver);
    }
    @BeforeMethod
    public void goToUrl() {
        driver.get("https://www.saucedemo.com/");
        landingPage.clickLoginButton();
        landingPage.login("standard_user", "secret_sauce");
        productsPage.clickBackpackAddToCart();
        productsPage.clickJacketAddToCart();
        productsPage.clickOnesieAddToCart();
        Assert.assertTrue(productsPage.isShoppingCartBadgeDisplayed());
        productsPage.clickShoppingCart();
    }

    @Test
    public void verifyElementsDisplayed(){
        Assert.assertTrue(cartPage.isCartTitleDisplayed());
        Assert.assertTrue(cartPage.isShoppingCartDisplayed());
        Assert.assertTrue(cartPage.isShoppingCartBadgeDisplayed());
        Assert.assertTrue(cartPage.isBackpackItemDisplayed());
        Assert.assertTrue(cartPage.isBackPackPriceDisplayed());
        Assert.assertTrue(cartPage.isJacketItemDisplayed());
        Assert.assertTrue(cartPage.isJacketPriceDisplayed());
        Assert.assertTrue(cartPage.isOnesieItemDisplayed());
        Assert.assertTrue(cartPage.isOnesiePriceDisplayed());
        Assert.assertTrue(cartPage.isContinueShoppingButtonDisplayed());
        Assert.assertTrue(cartPage.isCheckoutButtonDisplayed());
    }
    @Test
    public void verifyItemIsRemovedFromCart() {
        cartPage.removeJacketFromCart();
        Assert.assertTrue(cartPage.verifyJacketIsNotDisplayed());
    }

    @Test
    public void continueShopping() {
        cartPage.clickContinueShoppingButton();
        Assert.assertTrue(cartPage.isBackpackItemDisplayed());
        Assert.assertTrue(cartPage.isJacketItemDisplayed());
        Assert.assertTrue(productsPage.isProductTitleDisplayed());
    }

    @Test
    public void verifyCheckout() {
       cartPage.clickCheckoutButton();
        Assert.assertTrue(cartPage.isFirstnameDisplayed());
        Assert.assertTrue(cartPage.isLastnameDisplayed());
        Assert.assertTrue(cartPage.isPostalCodeDisplayed());
    }

    @Test
    public void clickOnShoppingCartAfterRemovingItem() {
        cartPage.removeJacketFromCart();
        Assert.assertTrue(cartPage.verifyJacketIsNotDisplayed());
        cartPage.clickShoppingCart();
        Assert.assertTrue(cartPage.isBackpackItemDisplayed());
        Assert.assertTrue(cartPage.isOnesieItemDisplayed());
    }

    @Test
    public void changeItemQuantity() {
        cartPage.enterQuantity(3);
    }

    @AfterMethod
    public void delete(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

   // @AfterClass
    public void closeBrowser()
    {
        driver.quit();
    }


}
