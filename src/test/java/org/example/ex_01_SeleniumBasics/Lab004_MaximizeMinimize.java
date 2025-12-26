package org.example.ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab004_MaximizeMinimize {
    @Test
    public void TestTitle() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();

    }
}
