package org.example.ex_05_SeleniumWaits;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Lab020_FluentWait extends CommonToAll {

    @Test
    public void fluentWait(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com");

        WebElement closeModal = driver.findElement(By.cssSelector(".commonModal__close"));

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

        WebElement errorMessage = wait.until(
                new Function<WebDriver, WebElement>() {
                    @Override
                    public WebElement apply(WebDriver webDriver) {
                        return driver.findElement(By.cssSelector(".commonModal__close"));
                    }
                }
        );

        closeModal.click();
        driver.quit();
    }

}
