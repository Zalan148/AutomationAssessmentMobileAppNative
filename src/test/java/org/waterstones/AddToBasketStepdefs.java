package org.waterstones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.AddToBasketPage;



public class AddToBasketStepdefs {

    AddToBasketPage addToBasketPage = new AddToBasketPage();

    @And("I click Add to basket")
    public void iClickAddToBasket() {
    addToBasketPage.clickAddToBasket();
    }

    @Then("the book is added to the basket")
    public void theBookIsAddedToTheBasket() {
        addToBasketPage.clickBasket();
        addToBasketPage.basketHeader();
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.waterstones.app:id/text_total_item_count\"][@text='Total (1 item)']")).isDisplayed());
    }

}
