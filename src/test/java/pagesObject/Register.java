package pagesObject;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Assert;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("https://test-qa.inlaze.com/auth/sign-up")
public class Register extends PageObject {

    Login login = new Login();

    @FindBy(id = "full-name")
    public WebElement fullName;
    @FindBy(id = "email")
    public WebElement emailRegister;
    @FindBy(id = "password")
    public WebElement passwordRegister;
    @FindBy(id = "confirm-password")
    public WebElement repeatPassword;
    @FindBy(css = "button[type='submit'].btn.btn-primary")
    public WebElement signUpButton;
    @FindBy(className = "label-text-alt")
    public WebElement passwordMessage;


    public void fillsRegisterForm (List<List<String>> parameters){
        fullName.sendKeys(parameters.get(0).get(0));
        emailRegister.sendKeys(parameters.get(0).get(1));
        passwordRegister.sendKeys(parameters.get(0).get(2));
        repeatPassword.sendKeys(parameters.get(0).get(3));
    }

    public void signUp(){
        signUpButton.click();
    }

    public void verifyAccountCreation (){
        String textToVerify = login.successfulRegistration.getText();
        if (textToVerify.equals("Successful registration!")) {
            Logger.getLogger("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }
    }




    public void fillsPasswordFields (List<String> parameters){
        passwordRegister.sendKeys(parameters.get(0));
        repeatPassword.sendKeys(parameters.get(1));
    }
    public boolean passwordMatch (){
        return passwordMessage.isDisplayed();
    }


}
