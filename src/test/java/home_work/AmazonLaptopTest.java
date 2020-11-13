package test.java.home_work;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.pages.HomePage;
import test.java.pages.SearchPage;

import java.util.List;

public class AmazonLaptopTest extends TestBaseSetup {
    Logger logger = LogManager.getLogger(HomePage.class);
    HomePage homePage;
    SearchPage searchPage;
    By laptopInSearch = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
    //By checkBoxBtn = By.id(".//li[contains(text(),'"+laptps+"')]");
    //By checkBoxBtn = By.xpath("p_89/"+laptps+"");



    @BeforeMethod
    public void pageInitialize() {

        homePage = new HomePage(driver);

    }

    @Test (dataProvider = "Laps")
    public void testFirst(String laptps)  {

        By checkBoxBtn = By.xpath("//span[text()='"+laptps+"']");
        String searchItem = "laptops";
        homePage.open();
        homePage.typeInSearchField(searchItem).clickSearchBtn();
        driver.findElement(checkBoxBtn).isSelected();
        logger.info("CheckBoxSelected");

        List<WebElement> listLaptops = driver.findElements(laptopInSearch);

        for (WebElement laptop: listLaptops) {
            laptop.getText().equals(laptps);

        }

    }

    @AfterMethod
    public void EndTest() {
        driver.quit();
        Reporter.log("We have finished");
    }

    @DataProvider(name = "Laps")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"HP"},
                {"Acer"},
                {"Lenovo"},
                {"ASUS"},
                {"Dell"},
                {"Microsoft"},
                {"Apple"},
                {"jumper"},
                {"CHUWI"},
                {"LG"},



        };
    }

}
