package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.concurrent.TimeUnit;

public class UserRegistrationPage extends PageBase
{
    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "emailInput")
    WebElement emailTxtBox;

    @FindBy(id = "passwordInput")
    WebElement passwordTxtBox;

    @FindBy(id = "firstNameInput")
    WebElement firstnameTxtBox;

    @FindBy(id = "lastNameInput")
    WebElement lastTxtBox;

    @FindBy(id = "login-submit")
    WebElement loginBtn;

    @FindBy(id = "dd_header_accountMenuCaret")
    public WebElement myAccountBtn;

    @FindBy(css = "button.logOut")
    WebElement logoutBtn;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div[1]/div[2]/div[4]/div/div/div/button[8]")
    WebElement yourAccountBtn;




/*
    WebElement emailTxtBox = driver.findElement(By.id("emailInput"));
    WebElement passwordTxtBox = driver.findElement(By.id("passwordInput"));
    WebElement firstnameTxtBox = driver.findElement(By.id("firstNameInput"));
    WebElement lastTxtBox = driver.findElement(By.id("lastTxtBox"));
    WebElement loginBtn = driver.findElement(By.id("login-submit"));

 */



    public void UserRegistration(String email, String password, String firstname, String lastname) throws InterruptedException {
        emailTxtBox.sendKeys(email);
        passwordTxtBox.sendKeys(password);
        firstnameTxtBox.sendKeys(firstname);
        lastTxtBox.sendKeys(lastname);
        loginBtn.click();
         Thread.sleep(2000);


    }

    public void UserLogout() throws InterruptedException {
        myAccountBtn.click();

        Thread.sleep(2000);
        logoutBtn.click();
    }

    /*public void OpenMyAccountPage() throws InterruptedException {
        myAccountBtn.click();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(5000);
        yourAccountBtn.click();
    }

     */






}
