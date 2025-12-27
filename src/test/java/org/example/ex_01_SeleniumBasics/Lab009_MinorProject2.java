package org.example.ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Lab009_MinorProject2 {

    @Test
    public void addingExtension() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        File path = new File("src/test/java/org/example/ex_01_SeleniumBasics/AdBlockers.crx");

        chromeOptions.addExtensions(path);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=v-7w0BmW3Sk");

        Thread.sleep(15000);

        driver.quit();

    }

}
