package test.java.lesson8;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class AmazonWaitsTest {
    By searchInputBy = By.id("twotabsearchtextbox");
    By changeLangBtn = By.id("icp-nav-flyout");
    By changeRegionBtn = By.xpath("(//div[contains(text(), 'Change country/region.')])[1]\n");
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10,500);
    }

        @Test
    public void test1() {
        driver.get("https://www.amazon.com/");
        WebElement changeLang = driver.findElement(changeLangBtn);
        Actions actions = new Actions(driver);
        actions.moveToElement(changeLang).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(changeRegionBtn));
        driver.findElement(changeRegionBtn).click();


    }

//    @Test
//    public void test1() {
//        driver.get("https://www.amazon.com/");
//        WebElement searchInput = driver.findElement(searchInputBy);
//        driver.navigate().refresh();
//        searchInput = driver.findElement(searchInputBy);
//        searchInput.click();
//        String expectedColor = "rgb(17, 17, 17)";
//        String actualColor = driver.findElement(searchInputBy).getCssValue("border-color");
//        assertEquals(actualColor, expectedColor);
//
//
//    }

    @AfterMethod
    public void finalizeBrowser() {
        driver.quit();
    }

}
