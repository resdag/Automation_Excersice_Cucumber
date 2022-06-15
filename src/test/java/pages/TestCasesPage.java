package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class TestCasesPage {
    public TestCasesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//b[.='Test Cases']")
    public WebElement testCasesTitleText;
}
