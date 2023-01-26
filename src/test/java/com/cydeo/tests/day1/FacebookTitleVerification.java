package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTitleVerification {

    public static void main(String[] args) {

/*
        TC #1: Facebook title verification
1. Open Firefox browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook – log in or sign up”
         */

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");

        System.out.println(driver.getTitle());
        String expected = "Facebook - log in or sign up";

        if (driver.getTitle().equals(expected)){
            System.out.println("Passed");
        } else {
            System.out.println("failed");
        }
    }
}
