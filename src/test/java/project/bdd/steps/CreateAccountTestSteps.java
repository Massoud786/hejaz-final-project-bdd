package project.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.CreateAccountPage;
import project.bdd.utility.SeleniumUtilities;

public class CreateAccountTestSteps extends SeleniumUtilities {
    @When("User clicks on create primary account button")
    public void userClicksOnCreatePrimaryAccountButton() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }
    @Then("Validate form page title {string}")
    public void validateFormPageTitleAsExpected(String expected) {
        String actualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE);
        Assert.assertEquals(expected,actualTitle);
    }

}
