package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.CreateAccountPage;
import project.bdd.utility.RandomEmailGenerator;
import project.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class CreateAccountTestSteps extends SeleniumUtilities {
    private String randomEmail;
    @When("User clicks on create primary account button")
    public void userClicksOnCreatePrimaryAccountButton() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }
    @Then("Validate form page title {string}")
    public void validateFormPageTitleAsExpected(String expected) {
        String actualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE);
        Assert.assertEquals(expected,actualTitle);
    }
    @Given("User clicks on create primary account btn")
    public void userClicksOnCreatePrimaryAccountBtn() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }
    @When("User fills up the form with list map data table")
    public void user_fills_up_the_form_with_list_map_data_table(DataTable dataTable) {
    Map<String, String> data = dataTable.asMap();
    String firstName = data.get("firstName");
    String gender = data.get("gender");
    String employmentStatus = data.get("employmentStatus");
    String title = data.get("title");
    String lastName = data.get("lastName");
    String maritalStatus = data.get("maritalStatus");
    String dateOfBirth = data.get("dateOfBirth");
    randomEmail= RandomEmailGenerator.randomEmail();
    sentTextToElement(CreateAccountPage.EMAIL,randomEmail);
    sentTextToElement(CreateAccountPage.FIRST_NAME,firstName);
    selectFromDropDown(CreateAccountPage.GENDER,gender);
    sentTextToElement(CreateAccountPage.EMPLOYMENT_STATUS,employmentStatus);
    selectFromDropDown(CreateAccountPage.title,title);
    sentTextToElement(CreateAccountPage.LAST_NAME,lastName);
    selectFromDropDown(CreateAccountPage.MARITAL_STATUS,maritalStatus);
    sentTextToElement(CreateAccountPage.DATE_OF_BIRTH,dateOfBirth);

    }
    @When("user clicks on create account button")
    public void user_clicks_on_create_account_button() {
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }
    @Then("Validate user navigates to sign up your account page")
    public void validate_user_navigates_to_sign_up_your_account_page() {
        boolean isUserNavigatedToSignYourAccountPage = isElementDisplayed(CreateAccountPage.SIGN_UP_YOUR_ACCOUNT_PAGE);
        Assert.assertTrue(isUserNavigatedToSignYourAccountPage);
    }
    @Then("Validate email shows as expected on the page")
    public void validate_email_shows_as_expected_on_the_page() {
        String actualEmail = getElementText(CreateAccountPage.EMAIL_AS_SHOWN_ON_SIGN_UP_PAGE);
        String expectedEmail = randomEmail;
        Assert.assertEquals(expectedEmail,actualEmail);
    }

}
