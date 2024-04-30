package pages;

import org.openqa.selenium.By;
import org.waterstones.Hooks;

public class AddToBasketPage {
    public void clickAddToBasket() {
        Hooks.androidDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.waterstones.app:id/button_add_to_basket\"]")).click();
    }

    public void clickBasket() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.waterstones.app:id/navigation_bar_item_icon_view\"])[2]")).click();
    }

    public void basketHeader() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.TextView[@text=\"Basket\"])[1]")).isDisplayed();
    }
}
