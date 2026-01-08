package org.example.ex_06_SeleniumInputs;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab022_Dropdown extends CommonToAll {

    @Test
    public void dropdowns(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/dropdown");

        //Select dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select sel = new Select(dropdown);
        //sel.selectByIndex(1);
        //sel.selectByValue("2");
        sel.selectByVisibleText("Option 1");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }

}
