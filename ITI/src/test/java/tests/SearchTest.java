package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends TestBase
{

    SearchPage searchobject;
    @Test
    public void searchtoitem(){
        searchobject =new SearchPage(driver);
        searchobject.searchitem();
       // Actions action=new Actions(driver);
       // searchobject.searchitem();
       // action.sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
    }
}
