package steps;

import net.thucydides.core.annotations.Step;
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
    public void userEmail(List<String> parameters) {
        automationPageObject.userEnterEmail(parameters);
    }
    @Step
    public void submitCreateAccount() {
        automationPageObject.sendCreateAccount();
    }
    @Step
    public void fillsForms(List<String> parameters) {
        automationPageObject.fillsAllForm(parameters);
    }
    @Step
    public void userClicksRegister() {
        automationPageObject.userRegister();
    }
    @Step
    public void verifyMyAccount(List<String> parameters) {
        automationPageObject.verifyMyAccount(parameters);
    }
    @Step
    public void emailRegister(List<String> parameters) {
        automationPageObject.emailRegister(parameters);
    }
    @Step
    public void enterPassword(List<String> parameters) {
        automationPageObject.enterPassword(parameters);
    }
    @Step
    public void clickSingInRegister() {
        automationPageObject.clickSingInRegister();
    }

}
