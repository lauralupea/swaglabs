package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "title")
    WebElement productsTitle;

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;

    @FindBy(className = "shopping_cart_badge")
    WebElement shoppingCartBadge;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;

    @FindBy(className = "bm-menu-wrap")
    WebElement menuList;

    @FindBy(linkText = "inventory_sidebar_link")
    WebElement itemsSidebar;

    @FindBy(id = "about_sidebar_link")
    WebElement aboutSidebar;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutSidebar;

    @FindBy(id = "reset_sidebar_link")
    WebElement resetSidebar;

    @FindBy(className = "bm-cross-button")
    WebElement closeMenuButton;

    @FindBy(id = "item_4_title_link")
    WebElement backpackItem;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")
    WebElement backpackPrice;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement backpackAddToCartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpackFromCartButton;

    @FindBy(id = "item_0_title_link")
    WebElement bikeLightItem;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")
    WebElement bikeLightPrice;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLightAddToCartButton;

    @FindBy(id = "item_1_title_link")
    WebElement tshirtItem;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")
    WebElement tshirtPrice;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement tshirtAddToCartButton;

    @FindBy(id = "item_5_title_link")
    WebElement jacketItem;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")
    WebElement jacketPrice;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement jacketAddToCartButton;

    @FindBy(id = "item_2_title_link")
    WebElement onesieItem;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")
    WebElement onesiePrice;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement onesieAddToCartButton;

    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement removeOnesieFromCartButton;

    @FindBy(id = "item_3_title_link")
    WebElement redTshirtItem;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
    WebElement redTshirtPrice;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement redTshirtAddToCartButton;

    @FindBy(className = "social_twitter")
    WebElement twitterLink;

    @FindBy(className = "social_facebook")
    WebElement facebookLink;

    @FindBy(className = "social_linkedin")
    WebElement linkedinLink;

    public boolean isProductTitleDisplayed(){
        System.out.println("Product tile is displayed");
        return productsTitle.isDisplayed();
    }
    public boolean isShoppingCartDisplayed(){
        System.out.println("Shopping cart is displayed");
        return shoppingCart.isDisplayed();
    }
    public boolean isMenuButtonDisplayed(){
        System.out.println("Menu button is displayed");
        return menuButton.isDisplayed();
    }
    public boolean isBackpackItemDisplayed(){
        System.out.println("Backpack item is displayed");
        return backpackItem.isDisplayed();
    }
    public boolean isBackPackPriceDisplayed(){
        System.out.println("Backpack price is displayed");
        return backpackPrice.isDisplayed();
    }
    public boolean isBackPackAddToCartButtonDisplayed(){
        System.out.println("Backpack add to cart button is displayed");
        return backpackAddToCartButton.isDisplayed();
    }
    public boolean isBikeLightItemDisplayed(){
        System.out.println("Bike light item is displayed");
        return bikeLightItem.isDisplayed();
    }
    public boolean isBikeLightPriceDisplayed(){
        System.out.println("Bike light price is displayed");
        return bikeLightPrice.isDisplayed();
    }
    public boolean isBikeLightAddToCartButtonDisplayed(){
        System.out.println("Bike light add to cart button is displayed");
        return bikeLightAddToCartButton.isDisplayed();
    }
    public boolean isTshirtItemDisplayed(){
        System.out.println("Tshirt item is displayed");
        return tshirtItem.isDisplayed();
    }
    public boolean isTshirtPriceDisplayed(){
        System.out.println("Tshirt price is displayed");
        return tshirtPrice.isDisplayed();
    }
    public boolean isTshirtAddToCartButtonDisplayed(){
        System.out.println("Tshirt add to cart button is displayed");
        return tshirtAddToCartButton.isDisplayed();
    }
    public boolean isJacketItemDisplayed(){
        System.out.println("Jacket item is displayed");
        return jacketItem.isDisplayed();
    }
    public boolean isJacketPriceDisplayed(){
        System.out.println("Jacket price is displayed");
        return jacketPrice.isDisplayed();
    }
    public boolean isJacketAddToCartButtonDisplayed(){
        System.out.println("Jacket add to cart button is displayed");
        return jacketAddToCartButton.isDisplayed();
    }
    public boolean isOnesieItemDisplayed(){
        System.out.println("Onesie item is displayed");
        return onesieItem.isDisplayed();
    }
    public boolean isOnesiePriceDisplayed(){
        System.out.println("Onesie price is displayed");
        return onesiePrice.isDisplayed();
    }
    public boolean isOnesieAddToCartButtonDisplayed(){
        System.out.println("Onesie add to cart button is displayed");
        return onesieAddToCartButton.isDisplayed();
    }
    public boolean isRedTshirtItemDisplayed(){
        System.out.println("Red tshirt item is displayed");
        return redTshirtItem.isDisplayed();
    }
    public boolean isRedTshirtPriceDisplayed(){
        System.out.println("Red tshirt price is displayed");
        return redTshirtPrice.isDisplayed();
    }
    public boolean isRedTshirtAddToCartButtonDisplayed(){
        System.out.println("Red tshirt add to cart button is displayed");
        return redTshirtAddToCartButton.isDisplayed();
    }
    public boolean isTwitterLinkDisplayed(){
        System.out.println("Twitter link is displayed");
        return twitterLink.isDisplayed();
    }
    public boolean isFacebookLinkDisplayed(){
        System.out.println("Facebook link is displayed");
        return facebookLink.isDisplayed();
    }
    public boolean isLinkedinLinkDisplayed(){
        System.out.println("Linkedin link is displayed");
        return linkedinLink.isDisplayed();
    }
    public void clickMenuButton() {
        System.out.println("Click on Menu button");
        this.menuButton.click();
    }
    public boolean isMenuListDisplayed(){
        System.out.println("Menu list is displayed");
        return menuList.isDisplayed();
    }
    public void clickBackpackAddToCart() {
        System.out.println("Click on backpack add to cart button");
        this.backpackAddToCartButton.click();
    }
    public void clickRemoveBackpack() {
        System.out.println("Click on remove button");
        this.removeBackpackFromCartButton.click();
    }
    public void clickJacketAddToCart() {
        System.out.println("Click on jacket add to cart button");
        this.jacketAddToCartButton.click();
    }
    public void clickOnesieAddToCart() {
        System.out.println("Click on onesie add to cart button");
        this.onesieAddToCartButton.click();
    }
    public void clickRemoveOnesie() {
        System.out.println("Click on remove button");
        this.removeOnesieFromCartButton.click();
    }

    public void clickShoppingCart() {
        System.out.println("Click shopping cart button");
        this.shoppingCart.click();
    }
    public boolean isShoppingCartBadgeDisplayed(){
        System.out.println("Shopping cart badge is displayed");
        return shoppingCartBadge.isDisplayed();
    }








}
