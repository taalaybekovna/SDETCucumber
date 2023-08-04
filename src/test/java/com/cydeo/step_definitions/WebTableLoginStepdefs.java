package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStepdefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("user is on the login page of webatable app")
    public void userIsOnTheLoginPageOfWebatableApp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username Test")
    public void userEntersUsernameTest() {
        webTableLoginPage.username.sendKeys("Test");
    }

    @And("user enters password Tester")
    public void userEntersPasswordTester() {
        webTableLoginPage.password.sendKeys("Tester");
    }
    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        webTableLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void userShouldSeeUrlContainsOrders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("user enters username incorrect")
    public void user_enters_username_incorrect() {
        webTableLoginPage.username.sendKeys("incorrect");
    }
    @When("user enters password incorrect")
    public void user_enters_password_incorrect() {
        webTableLoginPage.password.sendKeys("incorrect");

    }

    @Then("user should see url contains login")
    public void userShouldSeeUrlContainsLogin() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.username.sendKeys(username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.password.sendKeys(password);

    }

    @When("user enters username {string} password {string} and logins")
    public void user_enters_username_password_and_logins(String username, String password) {
        webTableLoginPage.login(username, password);

    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String>credentials) {

        webTableLoginPage.username.sendKeys(credentials.get("username")); // you can use this way
        webTableLoginPage.password.sendKeys(credentials.get("password"));
        webTableLoginPage.loginBtn.click();
       // webTableLoginPage.login(credentials.get("username"), credentials.get("password")); // or you can use this. Both works.

    }



}
