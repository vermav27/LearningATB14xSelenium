package org.example.ex_08_SeleniumTables;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab026_MiniProject extends CommonToAll {

    @Test
    public void tables(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody "));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int numberOfRows = rows.size();

        for(int i = 0;i < numberOfRows;i++){

            List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
            for(WebElement c:col){
                System.out.println(c.getText());
            }
        }

        driver.close();

    }

}
