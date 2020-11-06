package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftPage {
    WebDriver driver;
    WebDriverWait wait;

    By selectedPriceResultBy = By.xpath("//span[contains(text(), 'results for')]/following-sibling::span[@class='a-color-state a-text-bold']");
    By giftsBy = By.xpath("//div[@data-component-type='s-search-result']");


    public GiftPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10,500);
    }

    public GiftPage open() {
        driver.get("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc");
        wait = new WebDriverWait(driver, 10,500);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply (WebDriver driver){
                return driver.findElements(By.xpath("//div[@id='nav-xshop']/a")).size() == 6;
            }
        });
        return this;
    }

    public GiftPage clickPrice(String price) {
        By price200AboveBy = By.xpath("(//span[text()='" + price + "'])[1]");
        driver.findElement(price200AboveBy).click();
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(selectedPriceResultBy),
                driver1 -> driver1.findElement(selectedPriceResultBy).getText().equals(price),
                driver1 -> driver1.findElements(giftsBy).size() > 1
        ));
        return this;
    }
}
