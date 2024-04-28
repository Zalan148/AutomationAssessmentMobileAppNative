package org.waterstones;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.SearchPage;

public class StepDefsSearch {

    SearchPage searchPage = new SearchPage();
    @Given("the Waterstones app is open")
    public void theWaterStonesAppIsOpen() {
        searchPage.appOpen();
    }

    @When("I search for a book")
    public void iSearchForACoffeeMachine() {
        searchPage.searchForBook();
    }

    @Then("the search results are displayed")
    public void theSearchResultsAreDisplayed() {
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.waterstones.app:id/text_title\" and @text=\"Lonely Planet China\"]")).isDisplayed());
    }
}
