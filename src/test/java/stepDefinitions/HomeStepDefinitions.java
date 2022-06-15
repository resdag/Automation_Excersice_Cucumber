package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomeStepDefinitions {
    HomePage homePage = new HomePage();

    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.subscriptionTitle);

    }

    @Given("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        org.junit.Assert.assertTrue(homePage.subscriptionTitle.isDisplayed());
    }

    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        homePage.subscriptionTextBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail") + Keys.ENTER);
    }

    @Given("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        Assert.assertTrue(homePage.footerElement.getText().contains("You have been successfully subscribed!"));
    }
}
