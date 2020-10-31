package test.java.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class AmazonWaitsTask8 {
    WebDriver driver;
    WebDriverWait wait;

    By signIn = By.xpath("//span[text()='Hello, Sign in']");
    By createAccount = By.id("createAccountSubmit");
    By confirmCreating = By.id("continue");
    By errorName = By.xpath("//div[contains(text(),'Enter your name')]");
    By errorEmail = By.xpath("//div[contains(text(),'Enter your email')]");
    By errorPass = By.xpath("//div[contains(text(),'Enter your password')]");
    By nameField = By.id("ap_customer_name");
    By emailField = By.id("ap_email");
    By passField = By.id("ap_password");


    @BeforeMethod
    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10,500);
    }

    @Test
    public void negativeTest1(){
        WebElement signInBtn = driver.findElement(signIn);
        signInBtn.click();

        WebElement createAccountBtn = driver.findElement(createAccount);
        createAccountBtn.click();

        WebElement confirmCreatingBtn = driver.findElement(confirmCreating);
        confirmCreatingBtn.click();

        WebElement errorNameTxt = driver.findElement(errorName);
        errorNameTxt.isDisplayed();

        WebElement errorEmailTxt = driver.findElement(errorEmail);
        errorEmailTxt.isDisplayed();

        WebElement errorPassTxt = driver.findElement(errorPass);
        errorPassTxt.isDisplayed();

        String expectedColor = "rgb(221, 0, 0)";
        String actualColorName = driver.findElement(nameField).getCssValue("border-color");
        assertEquals(actualColorName, expectedColor);

        String actualColorEmail = driver.findElement(emailField).getCssValue("border-color");
        assertEquals(actualColorName, expectedColor);

        String actualColorField = driver.findElement(passField).getCssValue("border-color");
        assertEquals(actualColorName, expectedColor);


    }

    @AfterMethod
    public void EndTest() {
        driver.quit();
    }


}
