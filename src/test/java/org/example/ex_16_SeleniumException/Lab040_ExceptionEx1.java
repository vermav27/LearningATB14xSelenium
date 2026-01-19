package org.example.ex_16_SeleniumException;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab040_ExceptionEx1 extends CommonToAll {

    @Test
    public void excep(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.aqi.in/real-time-most-polluted-city-ranking");
        customWait(2000);

        try {
            WebElement test = driver.findElement(By.id("vineet"));
        } catch (Exception e) {
            System.out.println("Element Not Found !");
        }

        driver.close();

    }
}
