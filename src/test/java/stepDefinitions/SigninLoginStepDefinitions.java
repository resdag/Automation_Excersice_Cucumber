package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SigninLoginPage;
import utilities.ConfigReader;
import utilities.Driver;


public class SigninLoginStepDefinitions {
    SigninLoginPage signinLoginPage = new SigninLoginPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String fakerName = faker.name().fullName();
    String fakerEmail = faker.internet().emailAddress();
    String fakerPassword = faker.internet().password();

    @Given("Launch browser and Navigate to url {string}")
    public void launchBrowserAndNavigateToUrl(String autoExUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("autoExUrl"));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedUrl = ConfigReader.getProperty("autoExUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        org.junit.Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        signinLoginPage.signupLoginButton.click();
    }

    @Given("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(signinLoginPage.newUserSignupTextElement.isDisplayed());
    }

    @Given("Enter name and email address")
    public void enter_name_and_email_address() {
        actions.click(signinLoginPage.newUserSignupNameBox)
                .sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerEmail).perform();
    }

    @Given("Click Signup button")
    public void click_signup_button() {
        signinLoginPage.signupButton.click();
    }

    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        String enterAccountInfoText = signinLoginPage.enterAccountInfoTextElement.getText();
        org.junit.Assert.assertTrue(enterAccountInfoText.contains("ENTER ACCOUNT INFORMATION"));
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        actions.click(signinLoginPage.acountInfoMrRadioButton)
                .sendKeys(Keys.TAB).sendKeys(fakerName)
                .sendKeys(Keys.TAB).sendKeys(fakerPassword)
                .sendKeys(Keys.TAB).sendKeys("20")
                .sendKeys(Keys.TAB).sendKeys("May")
                .sendKeys(Keys.TAB).sendKeys("2001")
                .sendKeys(Keys.TAB).perform();
    }

    @Given("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

        actions.click(signinLoginPage.newsletterCheckbox).sendKeys(Keys.TAB).perform();
    }

    @Given("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        actions.click(signinLoginPage.newsletterCheckbox2).sendKeys(Keys.TAB).perform();
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(faker.company().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.country().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .perform();
    }

    @Given("Click Create Account button")
    public void click_create_account_button() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        org.junit.Assert.assertTrue(signinLoginPage.acountCreatedTextBox.isDisplayed());
    }

    @Given("Click Continue button")
    public void click_continue_button() {
        signinLoginPage.acountCreatedContinueButton.click();
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        org.junit.Assert.assertTrue(signinLoginPage.userNameElement.isDisplayed());
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        signinLoginPage.deleteAccountElement.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        //not found
    }

    @And("Close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        org.junit.Assert.assertTrue(signinLoginPage.loginYourAccountTextBox.isDisplayed());
    }

    @Given("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        signinLoginPage.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
        signinLoginPage.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExValidPassword"));
    }

    @Given("Click login button")
    public void click_login_button() {
        signinLoginPage.loginButton.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
    }

    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        signinLoginPage.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail"));
        signinLoginPage.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExInvalidPassword"));
    }

    @Given("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        org.junit.Assert.assertTrue(signinLoginPage.emailOrPasswordIncorrectText.isDisplayed());
    }

    @Given("Click Logout button")
    public void click_logout_button() {
        signinLoginPage.logoutButton.click();
    }

    @Given("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        org.junit.Assert.assertTrue(signinLoginPage.signupLoginButton.isDisplayed());
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        signinLoginPage.newUserSignupNameBox.sendKeys(ConfigReader.getProperty("autoExValidFullName"));
        signinLoginPage.newUserSignupEmailBox.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        org.junit.Assert.assertTrue(signinLoginPage.emailAdressExistTextElement.isDisplayed());
    }
}
