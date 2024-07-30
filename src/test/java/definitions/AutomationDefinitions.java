package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.AutomationSteps;

import java.util.List;

public class AutomationDefinitions {
    @Steps
    AutomationSteps automationSteps;
    @Given("^the user is on Homepage$")
    public void theUserIsOnHomepage() {
        automationSteps.openHomePage();
    }

    @Then("^the user clicks on Sign in$")
    public void theUserClicksOnSignIn() {
        automationSteps.SignIn();

    }

    @Then("^user enters email$")
    public void userEntersEmail(List<String> parameters) {
        automationSteps.userEmail(parameters);

    }

    @Then("^User Clicks create an account$")
    public void userClicksCreateAnAccount() {
        automationSteps.submitCreateAccount();
    }

    @Then("^User fills sign up form$")
    public void userFillsSignUpForm(List<String> parameters) {
        automationSteps.fillsForms(parameters);
    }

    @Then("^user clicks register$")
    public void userClicksRegister() {
        automationSteps.userClicksRegister();
    }

    @Then("^the user is taken my account page$")
    public void theUserIsTakenMyAccountPage(List<String> parameters) {
        automationSteps.verifyMyAccount(parameters);
    }



    @Given("^the user has a valid account$")
    public void theUserHasAValidAccount() {
        automationSteps.openHomePage();
    }

    @Then("^the clicks on sign in$")
    public void theClicksOnSignIn() {
        automationSteps.SignIn();
    }

    @Then("^enters email$")
    public void entersEmail(List<String> parameters) {
        automationSteps.emailRegister(parameters);
    }

    @Then("^enters password$")
    public void entersPassword(List<String> parameters) {
        automationSteps.enterPassword(parameters);

    }

    @Then("^clicks sign in$")
    public void clicksSignIn() {
        automationSteps.clickSingInRegister();

    }

    @Then("^the user is successfully logged in$")
    public void theUserIsSuccessfullyLoggedIn(List<String> parameters) {
        automationSteps.verifyMyAccount(parameters);

    }




}
