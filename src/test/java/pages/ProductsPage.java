package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {
    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement allProductsTextElement;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> productsListElements;

    @FindBy(xpath = "(//li[.='View Product'])[1]")
    public WebElement firstViewProduct;

    @FindBy(xpath = "//div[@class='product-information']")
    public WebElement productDetails;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProduct;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchProductSubmit;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public WebElement searchedProduct;

    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> cartPrductListElements;

    @FindBy(xpath = "(//div[@class='productinfo text-center'])[1]")
    public WebElement allProductsFirstElement;

    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
    public WebElement allProductsSecondElement;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[2]")
    public WebElement firstProductAddToCart;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[4]")
    public WebElement secondProductAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "(//td[@class='cart_price'])[1]")
    public WebElement cartFirstPrice;

    @FindBy(xpath = "(//td[@class='cart_price'])[2]")
    public WebElement cartSecondPrice;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement cartFirstTotolPrice;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement cartSecondTotolPrice;

    @FindBy(xpath = "(//td[@class='cart_quantity'])[1]")
    public WebElement cartFirstQuantity;

    @FindBy(xpath = "(//td[@class='cart_quantity'])[2]")
    public WebElement cartSecondQuantity;


}
