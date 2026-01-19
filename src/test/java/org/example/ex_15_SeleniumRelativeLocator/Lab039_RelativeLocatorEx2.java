package org.example.ex_15_SeleniumRelativeLocator;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab039_RelativeLocatorEx2 extends CommonToAll {

    @Test
    public void aqi(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.aqi.in/real-time-most-polluted-city-ranking");
        customWait(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        while(true){

            List<WebElement> cities = driver.findElements(By.xpath("//a[contains(@class,'location')]/div/p"));
            WebElement fwd1 = driver.findElement(By.xpath("//button[@aria-label='Next Page']"));

            for(WebElement cit:cities){
                WebElement aqi = driver.findElement((with(By.tagName("span")).toRightOf(cit)));
                WebElement rank = driver.findElement((with(By.tagName("p")).toLeftOf(cit)));
                WebElement status = driver.findElement((with(By.tagName("div")).toRightOf(aqi)));
                System.out.println(rank.getText() + " | " + cit.getText() + " | " + aqi.getText() + " | " + status.getText() + " | ");
            }

            try {
                WebElement next = wait.until(ExpectedConditions.elementToBeClickable(fwd1));
                next.click();
                customWait(2000);
            } catch (Exception e) {
                break;
            }

        }

        driver.close();

    }

}
