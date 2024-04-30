package org.waterstones;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.AccountPage;
import sections.LowerSection;

public class AccountStepdefs {

    AccountPage accountPage = new AccountPage();
    LowerSection lowerSection = new LowerSection();
    @When("I click Account")
    public void iClickAccount() {
        lowerSection.clickAccount();
    }

    @Then("I can either sign in or register")
    public void iCanEitherSignInOrRegister() {
        accountPage.signIn();
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Sign in\"]")).isDisplayed());
        accountPage.close();
        accountPage.register();
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Register\"]")).isDisplayed());
        accountPage.close();
    }
}
