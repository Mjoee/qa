package test.java.home_work;

import com.google.common.primitives.Chars;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverAmazon {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        By todaysDeals = By.xpath("//div[@id='nav-xshop']/a[1]");
        By firstProduct = By.xpath("(//div[@class='a-row layer backGround'])[1]");
        By newPrice1 = By.xpath("(//span[@class='a-price-whole'])[1]");
        By newPrice2 = By.xpath("(//span[@class='a-price-fraction'])[1]");
        By oldPrice = By.xpath("(//span[@class='a-size-mini a-color-tertiary octopus-widget-strike-through-price a-text-strike'])[1]");




        WebElement todaysDealsBtn = driver.findElement(todaysDeals);
        todaysDealsBtn.click();

        WebElement firstProductBtn = driver.findElement(firstProduct);
        firstProductBtn.click();

        WebElement priceFirst = driver.findElement(newPrice1);

        WebElement priceSecond = driver.findElement(newPrice2);
        WebElement oldPrice1 = driver.findElement(oldPrice);


        System.out.println("New price is: " + priceFirst.getText() + "." + priceSecond.getText());
        String clearOldPrice =  oldPrice1.getText();
        clearOldPrice.replace("$", "");
//        StringBuffer stringBuffer = new StringBuffer(clearOldPrice);
//        stringBuffer.delete(0,1);
//        clearOldPrice = stringBuffer.toString();
        System.out.println("Old price is: " + clearOldPrice);


        driver.quit();


    }




}
