package org.example.ex_03_SeleniumXPath_Axes;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab015_XpathAxes extends CommonToAll {

    @Test
    public void xpathAxes() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://automationexercise.com/");

        customWait(3000);

        WebElement womenList = driver.findElement(By.xpath("//h2[text()='Category']/following-sibling::div//child::a[@href='#Women']"));
        womenList.click();

        customWait(2000);
        WebElement menList = driver.findElement(By.xpath("//h2[text()='Category']/following-sibling::div//child::a[@href='#Men']"));
        menList.click();

        customWait(2000);
        WebElement poloList = driver.findElement(By.xpath("//h2[text()='Category']/following-sibling::div[3]/div//li[1]/a[text()='Polo']"));
        poloList.click();

        closeBrowser(driver);
        //Self
        //div[@class="Mammal"]
        // Ancestors
        // div[@class="Mammal"]/ancestor::div
        // Folliwng - sibling
        // div[@class="Mammal"]/following-siblings::div
        // Preceding Siblings
        // div[@class="Mammal"]/preceding-siblings::div
        // Child
        // div[@class="Mammal"]/child::div

    }

}
