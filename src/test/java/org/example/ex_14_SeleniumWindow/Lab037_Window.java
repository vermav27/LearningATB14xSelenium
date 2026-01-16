package org.example.ex_14_SeleniumWindow;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab037_Window extends CommonToAll {

    @Test
    public void windowSwitch(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/windows");

        String parent_id = driver.getWindowHandle();
        System.out.println("Parent Id : " + parent_id);

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHere.click();

        Set<String> win =  driver.getWindowHandles();
        for(String s:win){
            driver.switchTo().window(s);
            if(driver.getPageSource().contains("New Window")){
                System.out.println(s);
                break;
            }

        }
        driver.quit();
    }

}
