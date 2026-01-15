package org.example.ex_10_SeleniumActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab030_SpiceJet extends CommonToAll {
    @Test
    public void sourceDestination(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.spicejet.com/");

        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div[2]"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div[2]"));

        Actions act = new Actions(driver);
        act.moveToElement(source).click().sendKeys("DEL").build().perform();
        act.moveToElement(destination).click().sendKeys("BLR").build().perform();

        driver.close();
    }
}
