package org.waterstones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.SearchPage;

public class SearchStepdefs {

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
        Assert.assertTrue(Hooks.androidDriver.findElement(By.id("com.waterstones.app:id/button_sort")).isDisplayed());
    }

    @When("I select non-fiction books link")
    public void iSelectNonFictionBooksLink() {
        searchPage.selectNonFiction();
    }

    @And("I search for a non-fiction book")
    public void iSearchForANonFictionBook() {
        searchPage.searchForNonFictionBook();
    }

    @And("I select the non-fiction book from the search results")
    public void iSelectTheNonFictionBookFromTheSearchResults() throws InterruptedException {
        Thread.sleep(5000);
        searchPage.selectNonFictionBook();
    }
}
