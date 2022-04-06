package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;



public class UserRegistrationTest extends TestBase
{
    String email = "team45@gmail.com";
    String password = "noor123456789";
    String firstname = "mohamed1";
    String lastname = "magdy1";


     HomePage homeObject ;
     UserRegistrationPage registrationObject;
     LoginPage loginObject;


    @Test(priority = 1)
    public void userCanRegisterSuccessfully() throws InterruptedException
    {
        registrationObject = new UserRegistrationPage(driver);
        homeObject = new HomePage(driver);
        homeObject.OpenLRegistrationPage();
        registrationObject.UserRegistration(email, password, firstname, lastname);
       // Assert.assertTrue(registrationObject.myAccountBtn.isDisplayed());
        //registrationObject.UserLogout();

    }
    @Test(priority = 2)
    public void RegisterUserCanLogout() throws InterruptedException {
        registrationObject = new UserRegistrationPage(driver);
        registrationObject.UserLogout();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void RegisterUserCanLogin() throws InterruptedException {
        homeObject = new HomePage(driver);
        loginObject = new LoginPage(driver);
        registrationObject = new UserRegistrationPage(driver);
        homeObject.OpenLoginPage();
        loginObject.UserLogin(email,password);





    }




}
