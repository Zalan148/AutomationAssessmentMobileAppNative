package pages;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import org.waterstones.Hooks;

public class SearchPage {
    public void appOpen() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.waterstones.app:id/button_secondary\"]")).click();
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).isDisplayed();
    }

    public void searchForBook() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).click();
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).sendKeys("China Lonely Planet");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));

    }
}
