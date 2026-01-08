package org.example.ex_07_SeleniumAlerts;

import org.example.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab023_Alerts extends CommonToAll {

    @Test
    public void alerts(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        WebElement jsConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        WebElement jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        WebElement jsResult = driver.findElement(By.xpath("//p[@id='result']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //jsAlert
        wait.until(ExpectedConditions.visibilityOf(jsAlert));
        jsAlert.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        wait.until(ExpectedConditions.visibilityOf(jsAlert));
        Assert.assertEquals(jsResult.getText(),"You successfully clicked an alert");

        //jsConfirm

        wait.until(ExpectedConditions.visibilityOf(jsConfirm));
        jsConfirm.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        wait.until(ExpectedConditions.visibilityOf(jsAlert));
        Assert.assertEquals(jsResult.getText(),"You clicked: Ok");

        wait.until(ExpectedConditions.visibilityOf(jsConfirm));
        jsConfirm.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Assert.assertEquals(jsResult.getText(),"You clicked: Cancel");


        //jsPrompt
        wait.until(ExpectedConditions.visibilityOf(jsPrompt));
        jsPrompt.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Vineet");
        alert3.accept();
        Assert.assertEquals(jsResult.getText(),"You entered: Vineet");

        driver.close();

    }

}
