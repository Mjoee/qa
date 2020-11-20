package test.java.lesson9;

import io.qameta.allure.*;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.java.TestBaseSetup;
import test.java.pages.GiftPage;
import test.java.pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertTrue;
@Epic("Epic 1")
@Feature("First feature")
public class PoTest extends TestBaseSetup {
    HomePage homePage;
    GiftPage giftPage;


    @BeforeMethod
    public void pageInitialize() {

        homePage = new HomePage(driver);
        giftPage = new GiftPage(driver);
    }

    @Stories({
            @Story("A11"),
            @Story("A22")
    })
    @Description("Some description")
    @Severity(SeverityLevel.NORMAL)
    @Issues({
            @Issue("A1"),
            @Issue("A2")
    })
    @Test
    public void test1() {
        homePage
                .open()
                .clickSellBtn()
                .clickRegistryBtn()
                .clickSellBtn()
                .clickGiftCardsBtn();
        List<WebElement> cartsList = giftPage.clickPrice("$200 & Above").getCartsList();

        for (WebElement cart: cartsList) {
            int actualMaximumPrice = giftPage.getMaximumCartPrice(cart);
            assertTrue(
                    actualMaximumPrice >= 200,
                    String.format("Expected price %d to be more than 200", actualMaximumPrice)
            );
        }
    }
}
