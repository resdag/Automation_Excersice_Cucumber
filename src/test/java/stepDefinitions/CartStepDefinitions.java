package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CartPage;

public class CartStepDefinitions {
    CartPage cartPage = new CartPage();

    @And("Click Cart button")
    public void clickCartButton() {
        cartPage.cartButton.click();
    }
}
