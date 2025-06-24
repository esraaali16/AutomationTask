package Steps;

import Hooks.TestBase;
import Pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Search extends TestBase {
    SearchPage searchObject;

    @Given("user open Google homepage")
    public void userOpenGoogleHomepage()
    {
        driver.navigate().to("https://www.google.com");
    }


    @When("user enter {string} in search textbox")
    public void userEnterInSearchTextbox(String searchText)
    {
        searchObject = new SearchPage(driver);
        searchObject.fillSearchTextBox(searchText);
    }

    @And("click on search button")
    public void clickOnSearchButton()
    {
        searchObject.clickOnSearchButton();
    }


    @Then("search result page should contain relevant results")
    public void searchResultPageShouldContainRelevantResults()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3")));
        Assert.assertTrue(searchObject.searchResult());
    }

}
