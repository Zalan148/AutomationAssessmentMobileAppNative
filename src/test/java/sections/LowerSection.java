package sections;

import org.openqa.selenium.By;
import org.waterstones.Hooks;

public class LowerSection {

    public void clickWishList() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.waterstones.app:id/navigation_bar_item_icon_view\"])[3]")).click();
    }

    public void clickShop() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.waterstones.app:id/navigation_bar_item_icon_view\"])[4]")).click();
    }

    public void clickAccount() {
        Hooks.androidDriver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.waterstones.app:id/navigation_bar_item_icon_view\"])[5]")).click();
    }
}
