package org.example.ex_05_SeleniumWaits;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab018_ExplicitWait extends CommonToAll {

    @Test
    public void explicitWait(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement username = driver.findElement(By.cssSelector("#login-username"));
        WebElement password = driver.findElement(By.cssSelector("#login-password"));
        WebElement submit = driver.findElement(By.cssSelector("#js-login-btn"));

        username.sendKeys("hello@gmail.com");
        password.sendKeys("admin");
        submit.click();

        //here explicit wait solves the issue of last example

        WebElement error = driver.findElement(By.cssSelector("#js-notification-box-msg"));
        wait.until(ExpectedConditions.visibilityOf(error));

        String errorMsg = error.getText();
        System.out.println("errorMsg" + ":" + errorMsg);

        Assert.assertEquals(errorMsg,"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
