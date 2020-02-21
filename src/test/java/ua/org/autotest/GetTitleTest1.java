package ua.org.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

public class GetTitleTest1 {

    //public static void main(String[] args) throws InterruptedException {
    public String baseUrl = "https://accfarm.com/";
    public WebDriver driver;

    @BeforeTest
    public void setBaseUrl(){
       System.setProperty("webdriver.chrome.driver","/Users/olenatrunova/Downloads/chromedriver");
        driver=new ChromeDriver();
        driver.get(baseUrl);
    }

    @org.testng.annotations.Test
    public void VerifyHomepageTitle() {
        String expectedTitle = "Buy Cheap Instagram Accounts in Bulk⚡️ | Accfarm";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

        @Test

        public  void BuyAccounts() {
            driver.findElement(By.xpath("//div/a[@class='home-section__btn btn btn-green']")).click();
            String expectedUrl = "https://accfarm.com/buy-instagram-accounts";
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl);
        }
               @Test
                       public void BuyNow(){
                   driver.findElement(By.xpath("//div/a[@class='card-btn btn btn-green btn-large']")).click();
                   String expectedHeader="Exclusive PVA Instagram Account: Avatar and IP included";
                   String actualHeader=driver.getTitle();


            }


    @AfterTest
    public void endSession() {
        driver.quit();
    }

}

