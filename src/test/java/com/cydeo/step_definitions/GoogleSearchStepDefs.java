package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchStepDefs {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");
    }

    @When("user searches for {string} capitals")
    public void user_searches_for_capitals(String country) {
        googleSearchPage.searchBox.sendKeys("Capital city of " + country + Keys.ENTER);

    }

    @Then("user should see {string} result")
    public void user_should_see_result(String capital) {

        Assert.assertEquals(capital, googleSearchPage.result.getText());
    }


}
