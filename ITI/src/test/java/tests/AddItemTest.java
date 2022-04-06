package tests;

import org.testng.annotations.Test;
import pages.ItemsPage;

public class AddItemTest extends TestBase
{
    ItemsPage itemsObject;

    @Test
    public void AddItemToCart() throws InterruptedException {

        itemsObject = new ItemsPage(driver);
        itemsObject.AddItem();
        itemsObject.RemoveItem();
    }
}
