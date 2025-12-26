package org.example.ex_01_SeleniumBasics;


import org.example.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab006_MinorProject1 extends CommonToAll {

    @Test
    public void verifyTheTitle() throws InterruptedException {

        driver = new FirefoxDriver();
        openBrowser(driver,"https://www.google.com");

        if(driver.getTitle().contains("Google")){
            System.out.println("Test Case Passed.");
            Assert.assertEquals(driver.getTitle(),"Google");
            closeBrowser(driver);
        }else{
            System.out.println("Test Case Failed.");
            Assert.assertEquals(driver.getTitle(),"Google");
            closeBrowser(driver);
        }

    }

}
