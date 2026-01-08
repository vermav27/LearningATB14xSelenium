package org.example.ex_06_SeleniumInputs;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab021_Input_Radio_Checkbox extends CommonToAll {

    @Test
    public void inputs(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/practice.html");

        //Input Box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        inputBox.sendKeys("Hello world");


        //Radio Button
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='sex-1']"));
        radioButton.click();


        //Checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='tool-2']"));
        checkbox.click();

        //Select dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='continents']"));
        Select sel = new Select(dropdown);
        sel.selectByIndex(2);
        //sel.selectByValue("Australia");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }

}
