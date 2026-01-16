package org.example.ex_13_ShadowDom;

import org.example.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab036_ShadowDom extends CommonToAll {

    @Test
    public void shadow(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://selectorshub.com/iframe-in-shadow-dom/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza');");
        pizza.sendKeys("Farmhouse");
        driver.close();

    }

}
