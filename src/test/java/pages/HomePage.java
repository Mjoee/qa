package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    By sellBtnBy = By.xpath("(//div[@id='nav-xshop']/a)[5]");
    By registryBtnBy = By.xpath("(//div[@id='nav-xshop']/a)[4]");
    By giftCardsBtnBy = By.xpath("(//div[@id='nav-xshop']/a)[3]");

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage open() {
        driver.get("https://www.amazon.com/");
        wait = new WebDriverWait(driver, 10,500);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply (WebDriver driver){
                return driver.findElements(By.xpath("//div[@id='nav-xshop']/a")).size() == 6;
            }
        });
        return this;
    }

    public HomePage clickSellBtn() {
        driver.findElement(sellBtnBy).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[contains(text(), 'Sell on Amazon')])[1]")));
        return this;
    }

    public HomePage clickRegistryBtn() {
        driver.findElement(registryBtnBy).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@alt='Register with Amazon']")));
        return this;
    }


    public HomePage clickGiftCardsBtn() {
        driver.findElement(giftCardsBtnBy).click();
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text() = 'Gift Cards']")),
                driver1 -> driver1.findElements(By.xpath("//div[@class='bxc-grid__image   bxc-grid__image--light']")).size() >= 3
        ));
        return this;
    }


}
