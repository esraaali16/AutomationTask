package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends PageBase{

    public SearchPage(WebDriver driver)
    {
        super(driver);
    }

    private final By SearchTextBox = By.xpath("//textarea[@id='APjFqb']");
    private final By SearchButton = By.name("btnK");
    private final By SearchResult = By.cssSelector("h3");



    public void fillSearchTextBox(String searchText)
    {
        driver.findElement(SearchTextBox).sendKeys(searchText);
    }

    public void clickOnSearchButton()
    {
        driver.findElement(SearchButton).click();
    }


    public boolean searchResult()
    {
        List<WebElement> results = driver.findElements(SearchResult);
        for (WebElement result : results)
        {
            String resultText = result.getText();
            if (resultText.toLowerCase().contains("test automation")) {
                return true;
            }
        }
        return false;
    }
}
