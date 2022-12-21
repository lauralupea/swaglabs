package org.example.utilities;

import org.example.pages.CartPage;
import org.example.pages.LandingPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ProductsPageTest {
    WebDriver driver;
    ProductsPage productsPage;
    LandingPage landingPage;
    CartPage cartPage;

    @BeforeClass
    public void setup() {
        driver = WebDriverUtility.getDriver();
        driver.manage().window().maximize();
        this.productsPage = new ProductsPage(driver);
        this.landingPage = new LandingPage(driver);
        this.cartPage = new CartPage(driver);
    }
    @BeforeMethod
    public void goToUrl() {
        driver.get("https://www.saucedemo.com/");
        landingPage.clickLoginButton();
        landingPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void verifyElementsDisplayed() {
        Assert.assertTrue(productsPage.isProductTitleDisplayed());
        Assert.assertTrue(productsPage.isShoppingCartDisplayed());
        Assert.assertTrue(productsPage.isMenuButtonDisplayed());
        Assert.assertTrue(productsPage.isBackpackItemDisplayed());
        Assert.assertTrue(productsPage.isBackPackPriceDisplayed());
        Assert.assertTrue(productsPage.isBackPackAddToCartButtonDisplayed());
        Assert.assertTrue(productsPage.isBikeLightItemDisplayed());
        Assert.assertTrue(productsPage.isBikeLightPriceDisplayed());
        Assert.assertTrue(productsPage.isBikeLightAddToCartButtonDisplayed());
        Assert.assertTrue(productsPage.isTshirtItemDisplayed());
        Assert.assertTrue(productsPage.isTshirtPriceDisplayed());
        Assert.assertTrue(productsPage.isTshirtAddToCartButtonDisplayed());
        Assert.assertTrue(productsPage.isJacketItemDisplayed());
        Assert.assertTrue(productsPage.isJacketPriceDisplayed());
        Assert.assertTrue(productsPage.isJacketAddToCartButtonDisplayed());
        Assert.assertTrue(productsPage.isOnesieItemDisplayed());
        Assert.assertTrue(productsPage.isOnesiePriceDisplayed());
        Assert.assertTrue(productsPage.isOnesieAddToCartButtonDisplayed());
        Assert.assertTrue(productsPage.isRedTshirtItemDisplayed());
        Assert.assertTrue(productsPage.isRedTshirtPriceDisplayed());
        Assert.assertTrue(productsPage.isRedTshirtAddToCartButtonDisplayed());
        Assert.assertTrue(productsPage.isTwitterLinkDisplayed());
        Assert.assertTrue(productsPage.isFacebookLinkDisplayed());
        Assert.assertTrue(productsPage.isLinkedinLinkDisplayed());
    }

    @Test
    public void checkMenuSidebar() {
        productsPage.clickMenuButton();
        Assert.assertTrue(productsPage.isMenuListDisplayed());
    }

    @Test
    public void addItemsToCart() {
        productsPage.clickBackpackAddToCart();
        productsPage.clickJacketAddToCart();
        productsPage.clickOnesieAddToCart();
        Assert.assertTrue(productsPage.isShoppingCartBadgeDisplayed());
        productsPage.clickShoppingCart();
        Assert.assertTrue(productsPage.isBackpackItemDisplayed());
        Assert.assertTrue(productsPage.isJacketItemDisplayed());
        Assert.assertTrue(productsPage.isOnesieItemDisplayed());
    }

    @Test
    public void removeItemsFromCart() {
        productsPage.clickBackpackAddToCart();
        productsPage.clickOnesieAddToCart();
        productsPage.clickRemoveBackpack();
        productsPage.clickRemoveOnesie();
    }

    @AfterMethod
    public void delete(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }

    @AfterClass
    public void closeBrowser()
    {
        driver.quit();
    }
}
