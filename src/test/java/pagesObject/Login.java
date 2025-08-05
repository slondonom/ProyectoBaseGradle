package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {

    @FindBy (id = "email")
    public WebElement email;
    @FindBy (id = "password")
    public WebElement passwordLogin;
    @FindBy(css = "button[type='submit'].btn.btn-primary")
    public WebElement signInButton;
    @FindBy(xpath = "//app-toast[3]//div[text()='Successful registration!']")
    public WebElement successfulRegistration;




}
