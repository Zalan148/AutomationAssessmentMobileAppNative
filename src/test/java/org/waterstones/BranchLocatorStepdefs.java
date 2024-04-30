package org.waterstones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.BranchLocatorPage;
import sections.LowerSection;

public class BranchLocatorStepdefs {

    BranchLocatorPage branchLocatorPage = new BranchLocatorPage();
    LowerSection lowerSection = new LowerSection();

    @When("I click Shops button")
    public void iClickShopsButton() {
        lowerSection.clickShop();
    }

    @And("enter a city")
    public void enterACity() {
        branchLocatorPage.enterCity();
    }

    @Then("the search results for that city are displayed")
    public void theSearchResultsForThatCityAreDisplayed() {
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.waterstones.app:id/text_shop\" and @text=\"London - Leadenhall Market\"]")).isDisplayed());
    }

    @And("enter a country")
    public void enterACountry() {
        branchLocatorPage.enterCountry();
    }

    @Then("the search results for that country are displayed")
    public void theSearchResultsForThatCountryAreDisplayed() {
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.waterstones.app:id/text_shop\" and @text=\"United States\"]")).isDisplayed());
    }
}
