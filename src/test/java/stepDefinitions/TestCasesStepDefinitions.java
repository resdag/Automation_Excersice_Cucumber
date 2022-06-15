package stepDefinitions;

import io.cucumber.java.en.And;
import pages.TestCasesPage;

public class TestCasesStepDefinitions {
    TestCasesPage testCasesPage= new TestCasesPage();

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        testCasesPage.testCasesButton.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        org.junit.Assert.assertTrue(testCasesPage.testCasesTitleText.isDisplayed());
    }
}
