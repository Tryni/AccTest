package ua.org.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LandingPage {
    //public static void main(String[] args) throws InterruptedException {
    // System.setProperty("webdriver.chrome.driver","/Users/olenatrunova/Downloads/chromedriver");
    public  String baseUrl = "https://accfarm.com/";
    public WebDriver driver;

    @BeforeTest
public void setBaseUrl(){
    driver=new ChromeDriver();
    driver.get(baseUrl);
    }

@Test
public void VerifyHomepageTitle(){
    String expectedTitle="Verified Social Media Accounts on Sale";
    String actualTitle =driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);
}
@AfterTest
public void endSession(){
    driver.quit();}
}

