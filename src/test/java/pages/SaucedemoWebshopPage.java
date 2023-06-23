package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoWebshopPage {

    public SaucedemoWebshopPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "user-name")
    public WebElement userNameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "login-button")
    public WebElement logInButton;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addToCartButton1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    public WebElement addToCartButton2;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    public WebElement addToCartButton3;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    public WebElement addToCartButton4;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    public WebElement addToCartButton5;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    public WebElement addToCartButton6;

    @FindBy(xpath = "//a[@href='https://saucelabs.com/']")
    public WebElement aboutButton;

    @FindBy(xpath = "//a[@href='https://saucelabs.com/error/404']")
    public WebElement aboutButtonProblemUser;

    @FindBy(css = "[id=\"logout_sidebar_link\"]")
    public WebElement logOutButton;


    @FindBy(css = "[class=\"product_sort_container\"]")
    public WebElement sortButton;

    @FindBy(xpath = "//div[text()='Swag Labs']")
    public WebElement textSwagLabs;


    @FindBy(xpath = "//div[@class='error-message-container error']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    public WebElement firstItem;

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    public WebElement firstItemAfterClick;

    @FindBy(xpath = "(//a[@href='https://signup.saucelabs.com/'])[2]")
    public WebElement tryItFreeButton;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement shoppingCartItem;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartItemNumber;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeButton;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(id = "first-name")
    public WebElement firstNameInputBox;

    @FindBy(id = "last-name")
    public WebElement lastNameInputBox;

    @FindBy(id = "postalCode")
    public WebElement postalCodeInputBox;

    @FindBy(id = "continue")
    public WebElement continueBUtton;

    @FindBy(id = "finish")
    public WebElement finishBUtton;

    @FindBy(id = "back-to-products")
    public WebElement backToProductsBUtton;



















}
