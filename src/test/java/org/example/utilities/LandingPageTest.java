package org.example.utilities;

import org.example.pages.CartPage;
import org.example.pages.LandingPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LandingPageTest {
    WebDriver driver;
    LandingPage landingPage;
    ProductsPage productsPage;
    CartPage cartPage;

    @BeforeClass
    public void setup() {
        driver = WebDriverUtility.getDriver();
        driver.manage().window().maximize();
        this.landingPage = new LandingPage(driver);
        this.productsPage = new ProductsPage(driver);
        this.cartPage = new CartPage(driver);
    }
    @BeforeMethod
    public void goToUrl() {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void verifyElementsDisplayed() {
        Assert.assertTrue(landingPage.isLogoDisplayed());
        Assert.assertTrue(landingPage.isUsernameFieldDisplayed());
        Assert.assertTrue(landingPage.isPasswordFieldDisplayed());
        Assert.assertTrue(landingPage.isLoginButtonDisplayed());
        Assert.assertTrue(landingPage.areLoginCredentialsDisplayed());
        Assert.assertTrue(landingPage.isLoginPasswordDisplayed());
    }

    @Test
    public void checkError() {
        landingPage.clickLoginButton();
        Assert.assertEquals(landingPage.getLoginError(), "Epic sadface: Username is required");
    }

    @Test
    public void enterInvalidCredentials() {
        landingPage.clickLoginButton();
        landingPage.login("random_username", "password");
        Assert.assertEquals(landingPage.getLoginError(), "Epic sadface: Username and " +
                "password do not match any user in this service");
    }

    @Test
    public void enterCorrectCredentials() {
        landingPage.clickLoginButton();
        landingPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(landingPage.productsPageVerification());
        Assert.assertTrue(landingPage.shoppingCartVerification());
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
