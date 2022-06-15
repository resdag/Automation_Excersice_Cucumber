package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.ContactUsPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class ContactUsStepDefinitions {
    ContactUsPage contactUsPage = new ContactUsPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    SoftAssert softAssert = new SoftAssert();
    String fakerName = faker.name().fullName();
    String fakerEmail = faker.internet().emailAddress();
    String fakerPassword = faker.internet().password();

    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        contactUsPage.contactUsButton.click();
    }

    @Given("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        org.junit.Assert.assertTrue(contactUsPage.getInTouchTextElement.isDisplayed());
    }

    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        actions.click(contactUsPage.contactUsNameBox).sendKeys(fakerName)
                .sendKeys(Keys.TAB).sendKeys(fakerEmail)
                .sendKeys(Keys.TAB).sendKeys("Invoice")
                .sendKeys(Keys.TAB).sendKeys("This is my first article on this page")
                .perform();
    }

    @Given("Upload file")
    public void upload_file() {
        //Passed olmasi icin Dosya yolunda "AutoEx.docx" isimli dosya olmalidir
        String filePath = System.getProperty("user.home") + "\\Desktop\\TechProEd\\Dokumanlar\\Selenium\\AutoEx.docx";
        contactUsPage.uploadFileButton.sendKeys(filePath);
    }

    @Given("Click Submit button")
    public void click_submit_button() {
        contactUsPage.contactUsSubmitButton.click();
    }

    @Given("Click OK button")
    public void click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        org.junit.Assert.assertTrue(contactUsPage.contactUsAlertSuccessText.isDisplayed());
    }

    @Given("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        contactUsPage.contactUsSuccessHomeButton.click();
        String expectedUrl = ConfigReader.getProperty("autoExUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        org.junit.Assert.assertEquals(expectedUrl, actualUrl);
    }
}
