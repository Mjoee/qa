package test.java;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.java.utils.Screenshots;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBaseSetup {
    public WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(ITestContext iTestContext) {


        FirefoxOptions ffOption = new FirefoxOptions();
        ChromeOptions chromeOptions = new ChromeOptions();
        try {
            driver = new RemoteWebDriver(new URL("https://127.0.0.1:4444/wd/hub"),chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        iTestContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void finalizeBrowser() {
        attachText();
        attachScreen();
        driver.quit();
    }

    @Attachment
    private String attachText() {
        return "Text attachment";
    }

    @Attachment
    private byte[] attachScreen() {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
