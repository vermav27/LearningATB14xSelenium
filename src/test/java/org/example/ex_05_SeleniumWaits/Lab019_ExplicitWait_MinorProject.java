package org.example.ex_05_SeleniumWaits;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab019_ExplicitWait_MinorProject extends CommonToAll {

    @Test
    public void makeMyTripModal(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com");

        WebElement closeModal = driver.findElement(By.cssSelector(".commonModal__close"));
        waitForVisibility(driver,5,closeModal);
        closeModal.click();
        driver.quit();

    }

}
