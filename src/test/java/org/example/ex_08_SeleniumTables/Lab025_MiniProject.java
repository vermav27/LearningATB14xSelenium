package org.example.ex_08_SeleniumTables;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab025_MiniProject extends CommonToAll {

    @Test
    public void orange(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginBTN = driver.findElement(By.xpath("//button[@type='submit']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBTN.click();


        WebElement PIM = driver.findElement(By.xpath("//span[text()='PIM']"));
        wait.until(ExpectedConditions.visibilityOf(PIM));
        PIM.click();

        WebElement EmployeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        wait.until(ExpectedConditions.visibilityOf(EmployeeList));

        EmployeeList.click();

        WebElement table = driver.findElement(By.xpath("//div[@role='table']/div[2]/div"));
        wait.until(ExpectedConditions.visibilityOf(table));

        int numberOfRows = (driver.findElements(By.xpath("//div[@class='oxd-table-card']"))).size();
        int numberOfCol = 4;

        //generic xpath = //div[@role='table']/div[2]/div[row]/div/div[col]

        String firstPart = "//div[@role='table']/div[2]/div[";
        String secondPart = "]/div/div[";
        String thirdPart = "]";

        for(int row = 1;row<= numberOfRows;row++){
            for(int col = 3; col <= numberOfCol;col++ ){
                    System.out.println((driver.findElement(By.xpath(firstPart + row + secondPart + col + thirdPart))).getText());
            }
        }

        driver.close();

    }


}
