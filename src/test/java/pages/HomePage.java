package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionTitle;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionTextBox;

    @FindBy(xpath = "//div[@class='footer-widget']")
    public WebElement footerElement;
}
