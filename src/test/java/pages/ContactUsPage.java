package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchTextElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsNameBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement contactUsSubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsAlertSuccessText;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement contactUsSuccessHomeButton;
}
