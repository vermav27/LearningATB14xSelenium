package org.example.ex_16_SeleniumException;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab042_Exception_TimeOut extends CommonToAll {

    @Test
    public void time(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@a='input']")));


        driver.close();


    }

}
