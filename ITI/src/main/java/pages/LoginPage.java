package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }


    //finding webElement
    @FindBy(id = "emailInput")
    WebElement emailTxtBox;

    @FindBy(id = "passwordInput")
    WebElement passwordTxtBox;

    @FindBy(id = "login-submit")
    WebElement loginBtn;


    public void UserLogin (String email, String password)
    {
        emailTxtBox.sendKeys(email);
        passwordTxtBox.sendKeys(password);
        loginBtn.click();



    }


}

