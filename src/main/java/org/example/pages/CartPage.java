package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "title")
    WebElement yourCartTitle;

    @FindBy(id = "item_4_title_link")
    WebElement backpackItem;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")
    WebElement backpackPrice;

    @FindBy(id = "item_5_title_link")
    WebElement jacketItem;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")
    WebElement jacketPrice;

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement removeJacketButton;

    @FindBy(id = "item_2_title_link")
    WebElement onesieItem;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]/div[2]/div[2]/div")
    WebElement onesiePrice;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingButton;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;

    @FindBy(className = "shopping_cart_badge")
    WebElement shoppingCartBadge;

    @FindBy(id = "first-name")
    WebElement firstname;

    @FindBy(id = "last-name")
    WebElement lastname;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]")
    WebElement cartQuantity;


    public boolean isCartTitleDisplayed(){
        System.out.println("Product tile is displayed");
        return yourCartTitle.isDisplayed();
    }
    public boolean isShoppingCartDisplayed(){
        System.out.println("Shopping cart is displayed");
        return shoppingCart.isDisplayed();
    }
    public boolean isShoppingCartBadgeDisplayed(){
        System.out.println("Shopping cart badge is displayed");
        return shoppingCartBadge.isDisplayed();
    }
    public boolean isBackpackItemDisplayed(){
        System.out.println("Backpack item is displayed");
        return backpackItem.isDisplayed();
    }
    public boolean isBackPackPriceDisplayed(){
        System.out.println("Backpack price is displayed");
        return backpackPrice.isDisplayed();
    }
    public boolean isJacketItemDisplayed(){
        System.out.println("Jacket item is displayed");
        return jacketItem.isDisplayed();
    }
    public boolean isJacketPriceDisplayed(){
        System.out.println("Jacket price is displayed");
        return jacketPrice.isDisplayed();
    }
    public boolean isOnesieItemDisplayed(){
        System.out.println("Onesie item is displayed");
        return onesieItem.isDisplayed();
    }
    public boolean isOnesiePriceDisplayed(){
        System.out.println("Onesie price is displayed");
        return onesiePrice.isDisplayed();
    }
    public boolean isContinueShoppingButtonDisplayed(){
        System.out.println("Continue Shopping button is displayed");
        return checkoutButton.isDisplayed();
    }
    public boolean isCheckoutButtonDisplayed(){
        System.out.println("Checkout button is displayed");
        return checkoutButton.isDisplayed();
    }
    public void removeJacketFromCart(){
        this.removeJacketButton.click();
    }
    public boolean verifyJacketIsNotDisplayed() {
        try {
            if(jacketItem.isDisplayed()) {
                return false;
            }
            return false;
        } catch(Exception e) {
            return true;
        }
    }

    public void clickContinueShoppingButton(){
        this.continueShoppingButton.click();
    }

    public void clickCheckoutButton() {
        this.checkoutButton.click();
    }

    public boolean isFirstnameDisplayed(){
        System.out.println("Firstname is displayed");
        return firstname.isDisplayed();
    }

    public boolean isLastnameDisplayed(){
        System.out.println("Lastname is displayed");
        return lastname.isDisplayed();
    }

    public boolean isPostalCodeDisplayed(){
        System.out.println("Postal code is displayed");
        return postalCode.isDisplayed();
    }

    public void clickShoppingCart(){
        System.out.println("Click Shopping Cart is displayed");
        this.shoppingCart.click();
    }

    public void enterQuantity(int cartQuantity){
        System.out.println("Enter quantity: " + cartQuantity);
        this.cartQuantity.sendKeys();
    }

}
