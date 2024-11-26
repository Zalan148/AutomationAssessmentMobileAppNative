package pages;

import org.openqa.selenium.By;
import org.waterstones.Hooks;

public class WishListPage {
    public void wishListNotification() {
        Hooks.androidDriver.findElement(By.id("com.waterstones.app:id/button_secondary")).click();

    }
}
