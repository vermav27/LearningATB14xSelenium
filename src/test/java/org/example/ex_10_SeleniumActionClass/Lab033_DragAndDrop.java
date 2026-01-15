package org.example.ex_10_SeleniumActionClass;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab033_DragAndDrop extends CommonToAll {

    @Test
    public void dragAndDrop(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/drag_and_drop");

        WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions action = new Actions(driver);
        action.dragAndDrop(source,destination).build().perform();
        customWait(2000);
        driver.close();
    }

}
