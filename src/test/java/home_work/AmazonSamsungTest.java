package test.java.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.java.TestBaseSetup;
import test.java.pages.GiftPage;
import test.java.pages.HomePage;
import test.java.pages.SearchPage;

import java.util.List;

public class AmazonSamsungTest extends TestBaseSetup {

    HomePage homePage;

    SearchPage searchPage;
    By phoneInSearch = By.xpath("//h2[@class= 'a-size-mini a-spacing-none a-color-base s-line-clamp-2']");

    @BeforeMethod
    public void pageInitialize() {

        homePage = new HomePage(driver);

    }

    @Test (dataProvider = "items")
    public void testSecond(String searchItem) {

        homePage.open();
        homePage.typeInSearchField(searchItem).clickSearchBtn();
        List<WebElement> listPhones = driver.findElements(phoneInSearch);

        for (WebElement phone: listPhones) {
            phone.getText().equals(searchItem);

        }

    }

    @DataProvider(name = "items")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"MacBook"},
                {"Xiomi"},
                {"Meizu"},
                {"Samsung"},



        };
    }

}
