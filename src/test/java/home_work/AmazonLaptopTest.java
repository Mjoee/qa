package test.java.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetUp;
import test.java.pages.HomePage;
import test.java.pages.SearchPage;

import java.util.List;

public class AmazonLaptopTest extends TestBaseSetUp  {
    HomePage homePage;
    SearchPage searchPage;
    String laptps;
    By laptopInSearch = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
    By checkBoxBtn = By.xpath(".//li[contains(text(),'"+laptps+"')]");


    @BeforeMethod
    public void pageInitialize() {

        homePage = new HomePage(driver);

    }

    @Test
    public void testFirst() {
        laptps = "HP";
        String searchItem = "laptops";
        homePage.open();
        homePage.typeInSearchField(searchItem).clickSearchBtn();
        driver.findElement(checkBoxBtn).click();


        List<WebElement> listLaptops = driver.findElements(laptopInSearch);

        for (WebElement laptop: listLaptops) {
            laptop.getText().equals(laptps);

        }
        driver.findElement(checkBoxBtn).click();

    }

    @AfterMethod
    public void EndTest() {
        driver.quit();
        Reporter.log("We have finished");
    }
}
