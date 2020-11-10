package test.java.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetUp;
import test.java.pages.GiftPage;
import test.java.pages.HomePage;
import test.java.pages.SearchPage;

import java.util.ArrayList;
import java.util.List;

public class AmazoniPhoneTest extends TestBaseSetUp  {
    HomePage homePage;
    By phoneInSearch = By.xpath("//h2[@class= 'a-size-mini a-spacing-none a-color-base s-line-clamp-2']");

    @BeforeMethod
    public void pageInitialize() {

        homePage = new HomePage(driver);

    }

    @Test
    public void testFirst() {
        String searchItem = "Iphone";
        homePage.open();
        homePage.typeInSearchField(searchItem).clickSearchBtn();
        List<WebElement> listPhones = driver.findElements(phoneInSearch);

        for (WebElement phone: listPhones) {
            phone.getText().equals(searchItem);

        }


    }
}
