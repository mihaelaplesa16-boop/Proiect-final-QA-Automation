package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    @Test
    public void invalidLoginTest() throws InterruptedException {

        driver.get("https://practicesoftwaretesting.com/auth/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("proiect@gmail.com", "ParolaGresita123");

        Thread.sleep(3000);

        String errorMessage = loginPage.getErrorMessage();

        Assert.assertTrue(errorMessage.contains("Invalid email or password"));
    }

}