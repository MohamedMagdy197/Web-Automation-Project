package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase
{

    public WebDriver driver;

    public JavascriptExecutor jes;

    //create constructor
    public PageBase (WebDriver driver)
    {

        PageFactory.initElements(driver, this);
    }

    public static void clickButton(WebElement button)

    {
        button.click();
    }




    public static void setTextElementText (WebElement textElement, String value)

    {
        textElement.sendKeys(value);
    }

    public void scrollToBottom()
    {

        jes.executeScript("scrollBy(0,700)");

    }

    public void scrollToBottom2()
    {

        jes.executeScript("scrollBy(0,1600)");

    }








}
