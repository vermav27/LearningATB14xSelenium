package org.example.ex_09_SeleniumSVGElements;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab028_SvgExample extends CommonToAll {

    @Test
    public void maps(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.amcharts.com/svg-maps/?map=india");

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']//*[name()='g'][7]//*[name()='g']//*[name()='g']//*[name()='path']"));

        for(WebElement x:states){
            System.out.println(x.getDomAttribute("aria-label"));
            if(x.getDomAttribute("aria-label").contains("Tripura")){
                x.click();
            }
        }

        driver.close();

    }

}
