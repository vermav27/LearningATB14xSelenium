package org.example.ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab007_NavigateTo_Navigation {

    @Test
    public void navigateTo(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //Navigate to
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.close();

    }

}
