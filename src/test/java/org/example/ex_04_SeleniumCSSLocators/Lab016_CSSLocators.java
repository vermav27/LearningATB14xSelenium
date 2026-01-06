package org.example.ex_04_SeleniumCSSLocators;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab016_CSSLocators extends CommonToAll {

    @Test
    public void csslocators() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.flipkart.com");

        customWait(3000);

        WebElement flipkartTitle1 = driver.findElement(By.cssSelector("img[title='Flipkart']"));
        String title1 = flipkartTitle1.getText();

        WebElement flipkartTitle2 = driver.findElement(By.cssSelector("img[title*='Flip']")); //contains
        String title2 = flipkartTitle2.getText();

        WebElement flipkartTitle3 = driver.findElement(By.cssSelector("img[title^='Flip']")); //StartsWith
        String title3 = flipkartTitle3.getText();

        WebElement flipkartTitle4 = driver.findElement(By.cssSelector("img[title$='kart']")); //StartsWith
        String title4 = flipkartTitle4.getText();

        System.out.println(title1 + " " + title2 + " " + title3 + " " + title4);

        driver.quit();

        // for id : "#flipkart"
        // for class : ".flipkartclass"
        // for next element form a element : a[title$='kart'] > picture
        // for accessing child under a tag : a[title$='kart'] > picture > source:nth-child(2)
        // a[title$='kart'] > picture > source:nth-child(2n+1) - Gives odd tag
        // a[title$='kart'] > picture > source:nth-child(2n+2) - Gives even tag
        // a[title$='kart'] > picture > source:first-child - Gives first child
        // a[title$='kart'] > picture > source:last-child - Gives last child


    }

}
