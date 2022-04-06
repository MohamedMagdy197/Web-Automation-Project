package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import pages.UserRegistrationPage;
import utilities.Helper;

import java.util.concurrent.TimeUnit;

public class TestBase
{
    public static WebDriver driver;





    @BeforeSuite
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {

            String chromepath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromepath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scrollBy(0,10000)");



             /*
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
             */


        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            String firefoxpath = System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver",firefoxpath);
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
        driver.navigate().to("https://www.noon.com/egypt-ar/");


    }

    @AfterSuite
    public void stopDriver()
    {
        //driver.quit();
    }

    //take screenshot when testcase fail and save it in the Screenshots folder
    @AfterMethod
    public void ScreenshotOnFailure(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("Failed");
            System.out.println("Taking Screenshot......");
            Helper.CaptureScreenshot(driver, result.getName());


        }
    }

}
