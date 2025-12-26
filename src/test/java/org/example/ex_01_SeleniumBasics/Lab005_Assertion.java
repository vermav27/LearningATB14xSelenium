package org.example.ex_01_SeleniumBasics;
import static org.assertj.core.api.Assertions.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab005_Assertion {

    @Test
    public void Test_Assert(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Google");
        assertThat(driver.getTitle()).isNotNull().isEqualTo("Google");
        driver.close();


    }

}
