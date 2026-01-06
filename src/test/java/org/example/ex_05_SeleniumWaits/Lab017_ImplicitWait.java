package org.example.ex_05_SeleniumWaits;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab017_ImplicitWait extends CommonToAll {

    @Test
    public void implicitWait() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.cssSelector("#login-username"));
        WebElement password = driver.findElement(By.cssSelector("#login-password"));
        WebElement submit = driver.findElement(By.cssSelector("#js-login-btn"));

        username.sendKeys("hello@gmail.com");
        password.sendKeys("admin");
        submit.click();

        //here implicit wait is not working as get text execute before the text appears.
        // will solve this issue in next example

        WebElement error = driver.findElement(By.cssSelector("#js-notification-box-msg"));
        String errorMsg = error.getText();
        System.out.println("errorMsg" + ":" + errorMsg);

        Assert.assertEquals(errorMsg,"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
