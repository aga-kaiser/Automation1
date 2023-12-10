package com.loop.test.day5_testNG_checkbox_radioButtom_dropdown;


import org.testng.Assert;
import org.testng.annotations.*;

public class T1_testNG_intro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }


    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }
    @Test(priority = 1)
    public void test1(){
        System.out.println("test1 is running");
        String actual = "Feyruz";
        String expected = "Nadir";

        Assert.assertEquals(actual, expected, "Message from Assertion, it will show if test fails");
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("test2 is running");
    }

}
