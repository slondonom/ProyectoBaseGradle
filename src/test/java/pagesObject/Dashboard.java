package pagesObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends PageObject {

    @FindBy(css = "h2.font-bold")
    public WebElement userName;
    @FindBy(css = "label.btn.btn-ghost.btn-circle.avatar")
    public WebElement profileImage;
    @FindBy(xpath =  "//a[text()='Logout']")
    public WebElement logout;

}
