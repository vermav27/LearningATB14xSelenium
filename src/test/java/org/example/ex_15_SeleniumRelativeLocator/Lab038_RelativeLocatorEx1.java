package org.example.ex_15_SeleniumRelativeLocator;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab038_RelativeLocatorEx1 extends CommonToAll {

    @Test
    public void relativeLocator(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        driver.switchTo().frame("result");

        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        button.click();
        customWait(1000);
        WebElement input_username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement userNameError = driver.findElement((with(By.tagName("small")).below(input_username)));

        String getError = userNameError.getText();
        Assert.assertEquals(getError,"Username must be at least 3 characters");
        driver.quit();
    }

}
