package test.java.home_work;

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
//        driver.manage().window().maximize();

        //driver.get("https://www.amazon.com/");
        driver.get("https://www.amazon.com/deal/6176b4de/ref=gbps_img_m-9_475e_6176b4de?showVariations=true&smid=ATVPDKIKX0DER&pf_rd_p=5d86def2-ec10-4364-9008-8fbccf30475e&pf_rd_s=merchandised-search-9&pf_rd_t=101&pf_rd_i=15529609011&pf_rd_m=ATVPDKIKX0DER&pf_rd_r=S00QDC6ARSFF5Y24BT7D");

        By todaysDeals = By.xpath("//a[@href='/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl']");
        By firstProduct = By.id("//*[@id='dealTitle']/span");
        By price1 = By.xpath("//*[@id='octopus-dlp-asin-stream']/ul/li[1]/span/div/div[2]/div[4]/span[1]/span[2]/span[2]/text()");
        By price2 = By.xpath("//*[@id='octopus-dlp-asin-stream']/ul/li[1]/span/div/div[2]/div[4]/span[1]/span[2]/span[3]");
        By popUp = By.xpath("//div[@data-toaster-blocking]");
        By close = By.xpath("//*[@id='nav-main']/div[1]/div[2]/div/div[3]/span[1]/span/input");


//        WebElement todaysDealsBtn = driver.findElement(todaysDeals);
//        todaysDealsBtn.click();

        WebElement firstProductBtn = driver.findElement(firstProduct);
        firstProductBtn.click();

        WebElement priceFirst = driver.findElement(price1);

        WebElement priceSecond = driver.findElement(price2);


        System.out.println("New price is: " + priceFirst.getText() + "," + priceSecond.getText());


    }




}
