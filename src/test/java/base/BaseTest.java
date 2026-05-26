package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reports.ExtentReportManager;
import utils.DriverFactory;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeMethod
    public void setUp(Method method) {

        DriverFactory driverFactory = new DriverFactory();

        driver = driverFactory.createDriver();

        extent = ExtentReportManager.getReportInstance();

        test = extent.createTest(method.getName());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(TestConfig.getBaseUrl());
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException {

        Thread.sleep(3000);

        if (result.getStatus() == ITestResult.SUCCESS) {

            test.pass("Test passed");

        } else if (result.getStatus() == ITestResult.FAILURE) {

            test.fail(result.getThrowable());
        }

        extent.flush();

        if (driver != null) {
            driver.quit();
        }
    }
}