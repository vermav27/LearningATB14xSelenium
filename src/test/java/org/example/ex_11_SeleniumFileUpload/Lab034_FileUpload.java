package org.example.ex_11_SeleniumFileUpload;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab034_FileUpload extends CommonToAll {
    @Test
    public void fileUpload(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://practice-automation.com/file-upload/");

        WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
        String userDir = System.getProperty("user.dir");
        String path = userDir + "/src/test/java/org/example/ex_11_SeleniumFileUpload/helpMeUpload.txt";
        upload.sendKeys(path);
        WebElement btn = driver.findElement(By.xpath("//input[@id='upload-btn']"));
        btn.click();
        customWait(2000);
        driver.close();

    }
}
