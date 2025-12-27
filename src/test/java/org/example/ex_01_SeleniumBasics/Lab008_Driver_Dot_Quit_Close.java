package org.example.ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab008_Driver_Dot_Quit_Close {

    @Test
    public void driver_quit_close(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


        driver.quit(); //It will quit the browser and browser will become null.

        driver.close(); //It will close the current tab. Means if multiple tabs are open
                        // it will only close the current tab. driver is still not become null.

    }

}
