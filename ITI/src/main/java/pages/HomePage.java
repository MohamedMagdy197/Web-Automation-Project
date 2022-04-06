package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageBase
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(id = "dd_header_signInOrUp")
    public WebElement loginBtn;

    @FindBy(xpath = "//h3[contains(text(),'اشترك الآن')]")
    WebElement registerBtn;


    public void OpenLRegistrationPage() throws InterruptedException {
        Thread.sleep(5000);
        loginBtn.click();
        Thread.sleep(5000);
         registerBtn.click();
    }

    public void OpenLoginPage()
    {
        loginBtn.click();


    }







}

