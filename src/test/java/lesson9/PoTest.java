package test.java.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetUp;
import test.java.pages.GiftPage;
import test.java.pages.HomePage;


public class PoTest extends TestBaseSetUp {

    HomePage homePage;
    GiftPage giftPage;


    @BeforeMethod
    public void pageInitialize() {
        homePage = new HomePage(driver);
        giftPage = new GiftPage(driver);
    }

    @Test
    public void test1(){

        homePage
                .open()
                .clickSellBtn()
                .clickRegistryBtn()
                .clickGiftCardsBtn();
        giftPage.clickPrice("$200 & Above");


    }
}