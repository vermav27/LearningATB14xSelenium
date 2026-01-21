package org.example.ex_17_SeleniumDataDriven;

import org.example.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab044_DataDrivenExample extends CommonToAll {

    @Test(dataProvider = "getData")
    public void appVwo(String email,String pass){

        System.out.println("Email : " + email );
        System.out.println("Password : " + pass);
        System.out.println("----");

    }

    @DataProvider
    public Object[][] getData(){

        //Read Excel File
        //Convert into Rows and Cols
        //Return new Object[][]

        return null;
    }


}
