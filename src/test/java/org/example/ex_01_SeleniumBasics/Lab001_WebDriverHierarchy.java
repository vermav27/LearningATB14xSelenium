package org.example.ex_01_SeleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab001_WebDriverHierarchy {
    public static void main(String[] args) {

        //Hierarchy
        //SearchContext (2) > Webdriver (10) > RemoteDriver (15) > ChromiumDriver (25) >> EdgeDriver (45)
        //Search Context : Interface : findElement & findElements
        //Web Driver : Interface : Some incomplete functions
        //Remote Driver : It also has some functions

        SearchContext driver1 = new ChromeDriver(); // When son is born grand father is always present
        SearchContext driver2 = new FirefoxDriver();
        SearchContext driver3 = new EdgeDriver();

        //Valid syntax :
        SearchContext driver4 = new ChromeDriver();
        WebDriver driver5 = new ChromeDriver();
        RemoteWebDriver driver6 = new ChromeDriver();
        ChromeDriver driver7 = new ChromeDriver();

        //Which one we are going to use :
        //Scenarios :
        //Scenario 1
        //When you want to use one browser :
        ChromeDriver driver_chrome = new ChromeDriver();

        //Scenario 2
        //When you want to use multiple browser :
        WebDriver multi_drive = new ChromeDriver();

        //now i want to use another browser
        multi_drive = new FirefoxDriver();

        //Scenario 3
        //When want to run on remote machine aws,jenkins
        RemoteWebDriver rem_drive = new ChromeDriver();
    }
}
