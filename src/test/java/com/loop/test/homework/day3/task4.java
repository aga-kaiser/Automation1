package com.loop.test.homework.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {
    /*    1. Open Chrome browser
          2. Go to https://www.etsy.com
          3. Search for “wooden spoon”
          4. Verify title:
          Expected: “Wooden spoon | Etsy”
    */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google gmail page
        driver.get("https://www.etsy.com/");

        driver.navigate().to("https://www.etsy.com/search?q=wooden%20spoon&ref=auto-1&as_prefix=wooden%20");
        // maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title for the etsy \"wooden spoon\" page: " + actualTitle + " matches expected title: " + expectedTitle + ", => TEST PASS");
        } else {
            System.err.println("Actual title for the \"wooden spoon\" page: " + actualTitle + " DOES NOT match expected title: " + expectedTitle + ", => TEST FAIL");
        }
    }
}

