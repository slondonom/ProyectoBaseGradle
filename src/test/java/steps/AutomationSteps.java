package steps;

import net.serenitybdd.annotations.Step;

import pagesObject.AutomationPageObject;

import java.util.List;

public class AutomationSteps {
    AutomationPageObject automationPageObject;

    @Step

    public void openHomePage() {
        automationPageObject.open();
    }
    @Step
    public void SignIn() {
        automationPageObject.signIn();
    }
    @Step
    public void userEmail(String email) {
        automationPageObject.userEnterEmail(email);
    }
    @Step
    public void submitCreateAccount() {
        automationPageObject.sendCreateAccount();
    }
    @Step
    public void fillsForms(String firstName, String lastName, String email, String pass, String company, String addressOne, String addressTwo, String city, String postalCode, String otherInfo, String homePhone, String mobilePhone, String alias) {
        automationPageObject.fillsAllForm(firstName, lastName, email, pass, company, addressOne, addressTwo, city, postalCode, otherInfo, homePhone, mobilePhone, alias);
    }
    @Step
    public void userClicksRegister() {
        automationPageObject.userRegister();
    }
    @Step
    public void verifyMyAccount(String confirmAccount) {
        automationPageObject.verifyMyAccount(confirmAccount);
    }
    @Step
    public void emailRegister(String email) {
        automationPageObject.emailRegister(email);
    }
    @Step
    public void enterPassword(String password) {
        automationPageObject.enterPassword( password);
    }
    @Step
    public void clickSingInRegister() {
        automationPageObject.clickSingInRegister();
    }

}
