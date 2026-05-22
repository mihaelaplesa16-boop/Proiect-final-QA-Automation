package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {

        HomePage homePage = new HomePage(driver);

        String actualTitle = homePage.getHomePageTitle();

        Assert.assertTrue(actualTitle.contains("Practice Software Testing"));
    }

    @Test
    public void searchProductTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.searchForProduct("Pliers");

        Thread.sleep(3000);

        String productName = homePage.getFirstProductName();

        Assert.assertTrue(productName.contains("Pliers"));
    }

    @Test
    public void sortProductsTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.sortProducts("Name (A - Z)");

        Thread.sleep(3000);
    }

    @Test
    public void invalidSearchProductTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.searchForProduct("abcdefg12345");

        Thread.sleep(3000);

        String noResultsText = homePage.getNoResultsMessage();

        Assert.assertTrue(noResultsText.contains("There are no products found"));
    }

    @Test
    public void openProductDetailsTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.openFirstProduct();

        Thread.sleep(3000);

        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);

        Assert.assertTrue(currentUrl.contains("product"));
    }

}