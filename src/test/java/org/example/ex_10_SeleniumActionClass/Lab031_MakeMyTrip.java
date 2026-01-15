package org.example.ex_10_SeleniumActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab031_MakeMyTrip extends CommonToAll {
    @Test
    public void mmt(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
        customWait(1000);

        WebElement modal = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        modal.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
        WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));

        Actions action = new Actions(driver);
        action.moveToElement(fromCity).click().build().perform();
        customWait(1000);
        action.sendKeys(fromCity,"IXC").build().perform();
        customWait(1000);

        try {
            List<WebElement> place = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li/div/div/span"));
            for(WebElement source:place){

                if(source.getText().contains("IXC")){
                    source.click();
                    break;
                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //--------------

        action.moveToElement(toCity).click().build().perform();
        customWait(1000);
        action.sendKeys(toCity,"DEL").build().perform();
        customWait(1000);

        try {
            List<WebElement> place = driver.findElements(By.xpath("//label[@for='toCity']//following-sibling::div//div[@id='react-autowhatever-1']/div/ul/li/div/div/span"));
            for(WebElement dest:place){
                if(dest.getText().contains("DEL")){
                    dest.click();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
