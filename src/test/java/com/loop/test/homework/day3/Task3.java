package com.loop.test.homework.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /*
    1- Open a chrome browser
    2- Go to: https://google.com
    3- Click to Gmail from top right.
    4- Verify title contains:
    Expected: Gmail
    5- Go back to Google by using the .back();
    6- Verify title equals:
    Expected: Google
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google gmail page
        driver.get("https://www.google.com/");
        driver.navigate().to ("https://www.google.com/gmail/about/");


        // maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Gmail";

        String actualTitle = driver.getTitle();

        // System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title for the gmail page: " + actualTitle + " matches expected title: " + expectedTitle + ", => TEST PASS");
        } else {
            System.err.println("Actual title for the gmail page: " + actualTitle + "DOES NOT match expected title: " + expectedTitle + ", =. TEST FAIL");
        }


        //going back to google.com
        driver.navigate().back();
        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Actual title for google home page: " + actualTitle1 + " matches expected title: " + expectedTitle1 + ", => TEST PASS");
        } else {
            System.err.println("Actual title for google home page: " + actualTitle1 + " DOES NOT match expected title: " + expectedTitle1 + ", =. TEST FAIL");
        }
        // System.out.println("actualTitle1 = " + actualTitle1);
    }
}

