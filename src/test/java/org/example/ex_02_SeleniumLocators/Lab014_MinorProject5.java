package org.example.ex_02_SeleniumLocators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab014_MinorProject5 extends CommonToAll {

    @Test
    public void verifyTheMakeAppointment() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        WebElement btn_makeAppointment = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        btn_makeAppointment.click();

        List<WebElement> input_username = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        input_username.get(1).sendKeys("John Doe");

        List<WebElement> input_password = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        input_password.get(1).sendKeys("ThisIsNotAPassword");

        WebElement btn_login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        btn_login.click();

        customWait(3000);

        WebElement text_MakeAppointment = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        String makeAppointmentActualText = text_MakeAppointment.getText();

        Assert.assertEquals(makeAppointmentActualText,"Make Appointment");
        text_MakeAppointment.isDisplayed();

        closeBrowser(driver);

    }

}
