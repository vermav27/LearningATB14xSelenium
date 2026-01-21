package org.example.ex_17_SeleniumDataDriven;

import org.example.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab043_DataDrivernTest extends CommonToAll {

    @Test(dataProvider = "getData")
    public void aappVwoLogin(String email,String pass){
        System.out.println("Email : " + email );
        System.out.println("Password : " + pass);
        System.out.println("----");
    }

    @DataProvider
    public Object[][] getData(){

        return new Object[][]{
                new Object[]{"username1","Password2"},
                new Object[]{"username2","Password2"},
                new Object[]{"username3","Password3"}
        };

    }

}
