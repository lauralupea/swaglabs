package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "login_logo")
    WebElement logo;

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(id = "login_credentials")
    WebElement loginCredentials;

    @FindBy(className = "login_password")
    WebElement loginPassword;

    @FindBy(className = "error-message-container")
    WebElement loginError;

    @FindBy(className = "title")
    WebElement productsPage;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;



    public boolean isLogoDisplayed(){
        System.out.println("Logo is displayed");
        return logo.isDisplayed();
    }
    public boolean isUsernameFieldDisplayed(){
        System.out.println("Username field is displayed");
        return username.isDisplayed();
    }
    public boolean isPasswordFieldDisplayed(){
        System.out.println("Password field is displayed");
        return password.isDisplayed();
    }
    public boolean isLoginButtonDisplayed(){
        System.out.println("Login button is displayed");
        return loginButton.isDisplayed();
    }
    public boolean areLoginCredentialsDisplayed(){
        System.out.println("Login credentials are displayed");
        return loginCredentials.isDisplayed();
    }
    public boolean isLoginPasswordDisplayed(){
        System.out.println("Login password is displayed");
        return loginPassword.isDisplayed();
    }
    public void clickLoginButton() {
        System.out.println("Click Login button");
        this.loginButton.click();
    }
    public String getLoginError(){
        System.out.println("Login error is displayed");
        return loginError.getText();
    }
    public void enterUsername(String username){
        System.out.println("Enter username: " + username);
        this.username.sendKeys(username);
    }
    public void enterPassword(String password){
        System.out.println("Enter password: " + password);
        this.password.sendKeys(password);
    }
    public void login(String username, String pass){
        this.enterUsername(username);
        this.enterPassword(pass);
        this.clickLoginButton();
    }
    public boolean productsPageVerification(){
        System.out.println("Products page is displayed");
        return productsPage.isDisplayed();
    }
    public boolean shoppingCartVerification(){
        System.out.println("Products page is displayed");
        return shoppingCart.isDisplayed();
    }





}
