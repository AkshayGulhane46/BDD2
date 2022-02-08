package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myStepdefs {
    @Given("^I open the URL and verify the \"([^\"]*)\" of the page$")
    public void iOpenTheURLAndVerifyTheOfThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I Send the \"([^\"]*)\" and try to click on free button$")
    public void iSendTheAndTryToClickOnFreeButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I send the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSendTheAnd(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I Select the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSelectTheAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I Select the Captcha checkbox and click on submit$")
    public void iSelectTheCaptchaCheckboxAndClickOnSubmit() {
    }

    @Then("^test signup should be successful$")
    public void testSignupShouldBeSuccessful() {
    }
}
