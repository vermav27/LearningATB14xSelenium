package org.example.ex_02_SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab011_LinkText_PartialLinkText {

    @Test
    public void linkText_PartialLinkText() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        /*  ----LINK TEXT----
        WebElement linkText = driver.findElement(By.linkText("Start a free trial"));
        linkText.click();
        */

        WebElement partial_LinkText = driver.findElement(By.partialLinkText("trial"));
        partial_LinkText.click();



    }

}
