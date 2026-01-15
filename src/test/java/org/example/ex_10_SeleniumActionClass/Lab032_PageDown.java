package org.example.ex_10_SeleniumActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class Lab032_PageDown extends CommonToAll {
    @Test
    public void pageDown(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://thetestingacademy.com/");

        Actions action = new Actions(driver);
        action.keyDown(Keys.PAGE_DOWN).build().perform();
        customWait(2000);
        driver.close();

    }
}
