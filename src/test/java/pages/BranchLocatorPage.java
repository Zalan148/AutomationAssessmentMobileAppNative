package pages;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.waterstones.Hooks;

public class BranchLocatorPage {

    public void enterCity() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).click();
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).sendKeys("London");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void enterCountry() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).click();
        Hooks.androidDriver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.waterstones.app:id/search_src_text\"]")).sendKeys("United States");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
}
