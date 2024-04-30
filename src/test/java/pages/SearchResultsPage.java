package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.waterstones.Hooks;

public class SearchResultsPage {
    public void selectBook() {
        Hooks.androidDriver.findElement(AppiumBy.accessibilityId("Lonely Planet China")).click();
    }

    public void addToWishList() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.waterstones.app:id/image_wishlist\"])[1]")).click();
    }

}
