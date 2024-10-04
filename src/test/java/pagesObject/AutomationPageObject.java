package pagesObject;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.junit.Assert;

import java.util.List;
import java.util.logging.Logger;

@DefaultUrl("http://automationpractice.pl/index.php")
public class AutomationPageObject extends PageObject {

    @FindBy(xpath = "//*[@class='login']")
    WebElementFacade login;

    @FindBy(xpath = "//*[@id='email_create']")
    WebElementFacade emailCreate;

    @FindBy(xpath = "//*[@id='SubmitCreate']")
    WebElementFacade submitEmailCreate;

    @FindBy(xpath = "//*[@id='id_gender1']")
    WebElementFacade genderMale;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    WebElementFacade firstName;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    WebElementFacade lastName;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElementFacade firstNameYourAddress;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElementFacade lastNameYourAddress;


    @FindBy(xpath = "//*[@id='email']")
    WebElementFacade emailPersonalInformation;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElementFacade passwdPersonalInformation;

    @FindBy(xpath = "//*[@id='uniform-days']")
    WebElementFacade daysBirth;

    @FindBy(xpath = "//*[@id='days']/option[3]")
    WebElementFacade selectDaysNum;

    @FindBy(xpath = "//*[@id='uniform-months']")
    WebElementFacade monthBirth;

    @FindBy(xpath = "//*[@id='months']/option[3]")
    WebElementFacade selectMonthsOption;

    @FindBy(xpath = "//*[@id='uniform-years']")
    WebElementFacade yearsBirth;

    @FindBy(xpath = "//*[@id='years']/option[26]")
    WebElementFacade selectYearsOption;

    @FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
    WebElementFacade newsletter;

    @FindBy(xpath = "//span[text()='Add my first address']")
    WebElementFacade receiveOffers;

    @FindBy(css = "#submitAccount")
    WebElementFacade register;

    @FindBy(css = "#submitAddress")
    WebElementFacade btnsave;

    @FindBy(xpath = "//input[@id='company']")
    WebElementFacade company;

    @FindBy(xpath = "//input[@id='address1']")
    WebElementFacade txtAddress;

    @FindBy(xpath = "//input[@id='address2']")
    WebElementFacade txtAddressTwo;

    @FindBy(xpath = "//input[@id='city']")
    WebElementFacade txtCity;

    @FindBy(xpath = "//*[@id='uniform-id_state']")
    WebElementFacade selectState;

    @FindBy(xpath = "//*[@id='id_state']/option[3]")
    WebElementFacade selectStateOption;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElementFacade txtPostalCode;

    @FindBy(xpath = "//*[@id='uniform-id_country']")
    WebElementFacade selectCountry;

    @FindBy(xpath = "//*[@id='id_country']/option[1]")
    WebElementFacade selectCountryOption;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElementFacade txtAddInformation;

    @FindBy(xpath = "//input[@id='phone']")
    WebElementFacade txtHomePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElementFacade txtMobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElementFacade txtAliasReference;

    @FindBy(xpath = "//span[text()='Register']")
    WebElementFacade btnRegister;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElementFacade labelWelcomeAccount;


    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade emailRegister;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElementFacade passwdRegister;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElementFacade submitSingInRegister;


    @FindBy(css = "a.logout")
    WebElementFacade btnLogout;

    public void signIn() {
        login.click();

    }

    public void userEnterEmail(String email) {
        emailCreate.waitUntilVisible();
        emailCreate.type(email);
    }

    public void sendCreateAccount() {
        submitEmailCreate.click();
    }


    public void fillsAllForm(String firstNamee, String lastNamee, String email, String pass, String companyy, String addressOne, String addressTwo, String city, String postalCode, String otherInfo, String homePhone, String mobilePhone, String alias) {
        genderMale.click();
        firstName.sendKeys(firstNamee);
        lastName.sendKeys(lastNamee);
        emailPersonalInformation.type(email);
        passwdPersonalInformation.sendKeys(pass);
        daysBirth.waitUntilClickable();
        daysBirth.click();
        selectDaysNum.click();
        monthBirth.click();
        selectMonthsOption.click();
        yearsBirth.click();
        selectYearsOption.click();
        newsletter.click();
        register.click();
        receiveOffers.click();


        firstNameYourAddress.sendKeys(firstNamee);
        lastNameYourAddress.sendKeys(lastNamee);
        company.sendKeys(companyy);
        txtAddress.sendKeys(addressOne);
        txtAddressTwo.sendKeys(addressTwo);
        txtCity.sendKeys(city);
        selectState.click();
        selectStateOption.click();
        txtPostalCode.sendKeys(postalCode);
        selectCountry.click();
        selectCountryOption.click();
        txtAddInformation.sendKeys(otherInfo);
        txtHomePhone.sendKeys(homePhone);
        txtMobilePhone.sendKeys(mobilePhone);
        txtAliasReference.type(alias);
    }




    public void userRegister() {
        btnsave.click();
    }


    public void verifyMyAccount( String confirmAccount) {

        String textToVerify = labelWelcomeAccount.getText();
        if (textToVerify.equals(confirmAccount)) {
            Logger.getLogger("TEST SUCCESS");
            btnLogout.click();
        } else {
            Assert.fail("TEST FAILED");
        }
    }

    public void emailRegister(String email) {
        emailRegister.sendKeys(email);
    }


    public void enterPassword(String password) {
        passwdRegister.sendKeys( password);
    }


    public void clickSingInRegister() {
        submitSingInRegister.click();
    }

}
