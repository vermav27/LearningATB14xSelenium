package org.example.ex_09_SeleniumSVGElements;

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

public class Lab027_SvgElement extends CommonToAll {

    @Test
    public void flipkart(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.flipkart.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        searchBox.sendKeys("Macmini");

        List<WebElement> svgs = driver.findElements(By.xpath("//*[local-name()='svg']"));

        /*
            //*[local-name()='svg']
            //*[name()='svg']
        */


        customWait(4000);

        svgs.get(0).click();

        customWait(4000);

        List<WebElement> heading = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MPC') or contains(@data-id,'COM')]/div/a[2]"));
        //int numberOfElements = heading.size();

        wait.until(ExpectedConditions.visibilityOf(heading.get(11)));

        for(WebElement h:heading){
            System.out.println(h.getText());
        }

        driver.close();

    }

}
