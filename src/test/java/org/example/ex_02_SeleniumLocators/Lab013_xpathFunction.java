package org.example.ex_02_SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab013_xpathFunction {

    @Test
    public void xpathFunctions(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement button_option1 = driver.findElement(By.xpath("//a[text()='Make Appointment']")); //Exact Match
        WebElement button_option2 = driver.findElement(By.xpath("//a[contains(text(),'Make')]")); //Contains a part of text
        WebElement button_option3 = driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        WebElement button_option4 = driver.findElement(By.xpath("//a[contains(text(),'Appointment')]"));
        WebElement button_option5 = driver.findElement(By.xpath("//a[normalize-space()='Make Appointment']")); //Trims the trailing space of the text
        WebElement button_option6 = driver.findElement(By.xpath("//a[starts-with(@id,'btn-make')]")); //startswith
        WebElement button_option7 = driver.findElement(By.xpath("//a[starts-with(text(),'Make')]"));
        WebElement button_option8 = driver.findElement(By.xpath("//a[contains(@id,'btn-make-')]"));
        WebElement button_option9 = driver.findElement(By.xpath("//a[text()='Make Appointment' and contains(@id,'btn-make-appointment')]"));


        button_option9.click();
    }

}
