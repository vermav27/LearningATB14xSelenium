package org.example.ex_16_SeleniumException;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab041_Exception_Stale extends CommonToAll {

    @Test
    public void stale(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.google.com/");

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
        driver.navigate().refresh();

        //If we refresh the page then we have to relocate the element else selenium will give stale element exception

        try {
            searchBox.sendKeys("Test");
        } catch (Exception e) {
            System.out.println("Stale Element Exception");
        }
        customWait(2000);
        driver.close();
    }

}
