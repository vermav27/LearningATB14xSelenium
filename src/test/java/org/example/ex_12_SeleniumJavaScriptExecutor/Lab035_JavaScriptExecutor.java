package org.example.ex_12_SeleniumJavaScriptExecutor;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab035_JavaScriptExecutor extends CommonToAll {

    @Test
    public void javascriptExe(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://thetestingacademy.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //To get the url of current page
        String url = js.executeScript("return document.URL;").toString();
        System.out.println(url);

        //navigate to another url
        js.executeScript("window.location = 'https://www.youtube.com/';");
        customWait(3000);

        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);

        WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
        search.sendKeys("Classic 350");

        WebElement but = driver.findElement(By.xpath("//button[@aria-label='Search']//span[contains(@class,'ytSpecIconShapeHost')]"));
        but.click();
        customWait(3000);

        js.executeScript("window.scrollBy(0,1000);");
        customWait(3000);

        driver.close();



    }

}
