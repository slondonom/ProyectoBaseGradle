package definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.AutomationSteps;

import java.util.List;

public class AutomationDefinitions {
    @Steps
    AutomationSteps automationSteps;

    @Given("the user is on Homepage")
    public void theUserIsOnHomepage() {
        automationSteps.openHomePage();
    }

    @Then("the user clicks on Sign in")
    public void theUserClicksOnSignIn() {
        automationSteps.SignIn();

    }

    @Then("user enters email {string}")
    public void userEntersEmail(String email) {
        automationSteps.userEmail(email);

    }

    @Then("User Clicks create an account")
    public void userClicksCreateAnAccount() {
        automationSteps.submitCreateAccount();
    }

    @Then("User fills sign up form {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userFillsSignUpForm(String firstName, String lastName, String email, String pass, String company, String addressOne, String addressTwo, String city, String postalCode, String otherInfo, String homePhone, String mobilePhone, String alias) {
        automationSteps.fillsForms(firstName, lastName, email, pass, company, addressOne, addressTwo, city, postalCode, otherInfo, homePhone, mobilePhone, alias);
    }

    @Then("user clicks register")
    public void userClicksRegister() {
        automationSteps.userClicksRegister();
    }

    @Then("the user is taken my account page {string}")
    public void theUserIsTakenMyAccountPage(String confirmAccount) {
        automationSteps.verifyMyAccount(confirmAccount);
    }



    @Given("the user has a valid account")
    public void theUserHasAValidAccount() {
        automationSteps.openHomePage();
    }

    @Then("the clicks on sign in")
    public void theClicksOnSignIn() {
        automationSteps.SignIn();
    }

    @Then("enters email {string}")
    public void entersEmail(String email) {

        automationSteps.emailRegister(email);
    }

    @Then("enters password {string}")
    public void entersPassword(String password) {
        automationSteps.enterPassword(password);

    }

    @Then("clicks sign in")
    public void clicksSignIn() {
        automationSteps.clickSingInRegister();

    }

    @Then("the user is successfully logged in {string}")
    public void theUserIsSuccessfullyLoggedIn(String confirmAccount) {
        automationSteps.verifyMyAccount(confirmAccount);

    }




}
