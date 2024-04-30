package pages;

import org.openqa.selenium.By;
import org.waterstones.Hooks;

public class AccountPage {

    public void signIn() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.waterstones.app:id/button_sign_in\"]")).click();

    }

    public void register() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.waterstones.app:id/button_register\"]")).click();
    }

    public void close() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.ImageButton")).click();
    }
}
