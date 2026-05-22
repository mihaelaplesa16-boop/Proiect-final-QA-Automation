package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;

    private By searchInput = By.id("search-query");

    private By searchButton = By.cssSelector("[data-test='search-submit']");
    private By firstProduct = By.cssSelector("[data-test='product-name']");
    private By sortDropdown = By.cssSelector("[data-test='sort']");
    private By noResultsMessage = By.cssSelector("[data-test='no-results']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public void searchForProduct(String productName) {
        driver.findElement(searchInput).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public String getFirstProductName() {
        return driver.findElement(firstProduct).getText();
    }

    public void sortProducts(String option) {

        Select select = new Select(driver.findElement(sortDropdown));

        select.selectByVisibleText(option);
    }

    public String getNoResultsMessage() {

        return driver.findElement(noResultsMessage).getText();
    }

    public void openFirstProduct() {

        driver.findElement(firstProduct).click();
    }

}