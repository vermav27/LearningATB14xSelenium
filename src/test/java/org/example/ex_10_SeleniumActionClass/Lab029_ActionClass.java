package org.example.ex_10_SeleniumActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Lab029_ActionClass extends CommonToAll {
    @Test
    public void actionClass(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/practice.html");

        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(firstName,"Hello world").keyUp(Keys.SHIFT).build().perform();

        driver.close();

    }
}
