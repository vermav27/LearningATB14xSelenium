package org.example.ex_02_SeleniumLocators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab010_MinorProject3 extends CommonToAll {

    @Test
    public void verifyTheErrorMessage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement email_inputBox = driver.findElement(By.id("login-username"));
        WebElement password_inputBox = driver.findElement(By.id("login-password"));
        WebElement signIn_button = driver.findElement(By.id("js-login-btn"));

        email_inputBox.sendKeys("admin@admin.com");
        password_inputBox.sendKeys("password@1234");
        signIn_button.click();

        customWait(5000);

        WebElement errorMessage_box = driver.findElement(By.className("notification-box-description"));
        String errorMessage = errorMessage_box.getText();
        String expectedErrorMessage = "Your email, password, IP address or location did not match";

        Assert.assertEquals(errorMessage,expectedErrorMessage);

        driver.close();
    }

}
