package pages;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import common.ElementPresenceWait;
import org.waterstones.Hooks;

public class SearchPage {
    public void appOpen() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.id("com.waterstones.app:id/search_toolbar")));
    }

    public void searchForBook() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).click();
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).sendKeys("China Lonely Planet");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void selectNonFiction() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.waterstones.app:id/button_category\" and @text=\"Non-Fiction\"]")).click();
    }

    public void searchForNonFictionBook() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).click();
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).sendKeys("Abroad in Japan");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void selectNonFictionBook() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Abroad in Japan\"])[1]")).click();
    }
}
