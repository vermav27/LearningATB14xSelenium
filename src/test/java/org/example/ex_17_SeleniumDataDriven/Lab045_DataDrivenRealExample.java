package org.example.ex_17_SeleniumDataDriven;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab045_DataDrivenRealExample extends CommonToAll {

    @Test(dataProvider = "getData")
    public void appVwo(String email,String pass){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        WebElement email_inputBox = driver.findElement(By.id("login-username"));
        WebElement password_inputBox = driver.findElement(By.id("login-password"));
        WebElement signIn_button = driver.findElement(By.id("js-login-btn"));

        email_inputBox.sendKeys(email);
        password_inputBox.sendKeys(pass);
        signIn_button.click();

        customWait(3000);

        WebElement errorMessage_box = driver.findElement(By.className("notification-box-description"));
        String errorMessage = errorMessage_box.getText();
        String expectedErrorMessage = "Your email, password, IP address or location did not match";

        Assert.assertEquals(errorMessage,expectedErrorMessage);

        driver.close();

    }

    @DataProvider
    public Object[][] getData(){

        //Read Excel File
        //Convert into Rows and Cols

        //Return new Object[][]
        return utilExcel.getDataFromExcel("Creds_Sheet");
    }

}
