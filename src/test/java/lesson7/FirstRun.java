package test.java.lesson7;

import main.java.lesson3.objects.Animal;
import main.java.lesson3.objects.Cat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstRun {
    public static void main(String[] args) throws InterruptedException {
//        int a = 123;
//        long b = a;
//        int c = (int)b;
//
//        Cat cat = new Cat("Aasdasd");
//        Animal animal = cat;
//        Cat cat2 =  (Cat) animal;



        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        Thread.sleep(2000);

        By ByestSeller = By.xpath("//a[@href='/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl']");

        WebElement bestSellerBtn  = driver.findElement(ByestSeller);
        bestSellerBtn.click();

        WebElement bestSellerTitle = driver.findElement(By.id("fst-hybrid-dynamic-h1"));
        String titleString = bestSellerTitle.getText();

        System.out.println(titleString);

        driver.close();

    }




}
