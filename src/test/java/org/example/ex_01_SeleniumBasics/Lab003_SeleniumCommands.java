package org.example.ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab003_SeleniumCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

        driver.quit();

    }
}
