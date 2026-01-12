package org.example.ex_08_SeleniumTables;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab024_StaticTable extends CommonToAll {

    @Test
    public void staticTables(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/webtable.html");

        //xpath of any element = //table[@id='customers']/tbody/tr[2]/td[3]
        String firstPart = "//table[@id='customers']/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        int numberOfRows = (driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/following-sibling::tr"))).size() + 1;
        int numberOfCols = (driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"))).size();

        System.out.println(numberOfRows);
        System.out.println(numberOfCols);

        for(int row = 2;row<=numberOfRows;row++){
            for (int col = 1; col<=numberOfCols;col++){
                String value = (driver.findElement(By.xpath(firstPart + row + secondPart + col + thirdPart))).getText();
                System.out.println(value);
            }
        }

        driver.close();

    }

}
