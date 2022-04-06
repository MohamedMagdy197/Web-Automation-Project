package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase
{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "searchBar")
    WebElement search;
    public void searchitem(){
        search.click();
        search.sendKeys("mobile");
        search.sendKeys(Keys.ENTER);
    }
}
