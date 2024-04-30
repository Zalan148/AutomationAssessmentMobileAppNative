package org.waterstones;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SearchResultsPage;
import sections.LowerSection;

public class WishListStepdefs {

    SearchResultsPage searchResultsPage = new SearchResultsPage();

    LowerSection lowerSection = new LowerSection();

    @And("I select the book from the search results")
    public void iSelectTheBookFromTheSearchResults() {
        searchResultsPage.selectBook();
    }

    @And("I add the book to a Wish List")
    public void iAddTheBookToAWishList() {
        searchResultsPage.addToWishList();
    }

    @And("I click the Wish Lists button")
    public void iClickTheWishListsButton() {
        lowerSection.clickWishList();
    }

    @Then("the book is added to the Wish List")
    public void theBookIsAddedToTheWishList() {
        Assert.assertTrue(Hooks.androidDriver.findElement(AppiumBy.accessibilityId("Lonely Planet China")).isDisplayed());
    }
}