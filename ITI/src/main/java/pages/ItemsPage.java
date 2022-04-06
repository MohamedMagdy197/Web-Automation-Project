package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsPage extends PageBase{


    public ItemsPage(WebDriver driver) {
        super(driver);
        jes = (JavascriptExecutor) driver;
    }


    @FindBy(xpath = "//*[@id=\"productBox-N23101656A\"]/div/div/div[1]/div[1]/div/div[2]/div/img")
    WebElement perfume;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div/div/div[3]")
    WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"continue-shopping-btn\"]/span/span")
    WebElement follow;

    @FindBy(xpath = "//*[@id=\"productBox-N11201396A\"]/div/div/div[1]/div[1]/div/div[1]/div[2]/div/div/div/img")
    WebElement perfume2;

    @FindBy(xpath = "//div[@class='loaderCtr inactiveLoading']")
    WebElement addToCart2;

    @FindBy(xpath = "//*[@id=\"continue-shopping-btn\"]/span/span")
    WebElement follow2;

    @FindBy(className = "cartTitle")
    WebElement myCart;

    @FindBy(xpath = "//button[@class='sc-beec1d27-10 fMWXvJ']")
    WebElement removeItem;






    public void AddItem() throws InterruptedException {
        scrollToBottom();
        perfume.click();
        addToCart.click();
        follow.click();
        scrollToBottom2();
        perfume2.click();
        Thread.sleep(2000);
        addToCart2.click();
        follow2.click();
        Thread.sleep(2000);
        myCart.click();


    }

    public void RemoveItem()
    {
        removeItem.click();
    }
}
