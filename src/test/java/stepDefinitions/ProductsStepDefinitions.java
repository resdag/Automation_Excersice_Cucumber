package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ProductsStepDefinitions {
    ProductsPage productsPage = new ProductsPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Click on Products button")
    public void click_on_products_button() {
        productsPage.productsButton.click();
    }

    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        org.junit.Assert.assertTrue(productsPage.productsListElements.size() != 0);
    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        productsPage.firstViewProduct.click();
    }


    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl = ConfigReader.getProperty("autoExFirstProductDetails");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("exp = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        org.junit.Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        org.junit.Assert.assertTrue(productsPage.productDetails.getText().contains("Category"));
    }

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        productsPage.searchProduct.sendKeys(ConfigReader.getProperty("autoExValidProductName"));
        productsPage.searchProductSubmit.click();
    }

    @Given("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        String searchedProductText = productsPage.searchedProduct.getText();
        System.out.println("searchedProductText = " + searchedProductText);
        org.junit.Assert.assertTrue(searchedProductText.contains(ConfigReader.getProperty("autoExValidProductName")));
    }

    @Given("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        org.junit.Assert.assertTrue(productsPage.searchedProduct.isDisplayed());
    }

    @Given("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        productsPage.allProductsSecondElement.click();
    }

    @Given("Click View Cart button")
    public void click_view_cart_button() {
        productsPage.viewCartButton.click();
    }

    @Given("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertTrue(productsPage.cartPrductListElements.size() == 2);
    }

    @Given("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        // autoExPage.productsButton.click();
        // String expectedCartFirstElementText = autoExPage.firstProductElement.getText();
        // String expectedCartSecondElementText = autoExPage.secondProductElement.getText();
        // String actualCartFirstElementName = autoExPage.cartFirstElementName.getText();
        // String actualCartSecondElementName = autoExPage.cartSecondElementName.getText();
        // Driver.getDriver().navigate().back();
        // Assert.assertTrue(expectedCartFirstElementText.contains(actualCartFirstElementName) &&
        //         expectedCartSecondElementText.contains(actualCartSecondElementName) &&
        //         expectedCartFirstElementText.contains(autoExPage.cartTotalPriceElements.get(0).getText())&&
        //         expectedCartSecondElementText.contains(autoExPage.cartTotalPriceElements.get(1).getText()));
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(productsPage.allProductsTextElement.isDisplayed());

    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        actions.moveToElement(productsPage.allProductsFirstElement)
                .click(productsPage.firstProductAddToCart).perform();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        productsPage.continueShoppingButton.click();
    }
}
