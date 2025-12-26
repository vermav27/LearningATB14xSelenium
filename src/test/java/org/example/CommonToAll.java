package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonToAll {

    public WebDriver driver;

    public void openBrowser(WebDriver driver,String url) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public void closeBrowser(WebDriver driver){
        driver.close();
    }

}
