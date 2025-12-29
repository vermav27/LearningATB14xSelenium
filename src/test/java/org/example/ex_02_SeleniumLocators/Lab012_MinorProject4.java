package org.example.ex_02_SeleniumLocators;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab012_MinorProject4 extends CommonToAll {

    @Test
    @Description("Verification of error message on entering invalid email")
    public void ErrorMessageVerification() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");
        WebElement locator_StartAFreeTrial = driver.findElement(By.linkText("Start a free trial"));

        locator_StartAFreeTrial.click();
        customWait(1000);

        WebElement locator_email = driver.findElement(By.id("page-v1-step1-email"));
        locator_email.sendKeys("abc");

        WebElement locator_checkbox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        locator_checkbox.click();

        WebElement locator_SubmitButton = driver.findElement(By.tagName("button"));
        locator_SubmitButton.click();

        WebElement locator_errorLocator = driver.findElement(By.className("invalid-reason"));
        String actualError = locator_errorLocator.getText();
        String expectedError = "The email address you entered is incorrect.";

        Assert.assertEquals(actualError,expectedError);

        closeBrowser(driver);



    }

}
