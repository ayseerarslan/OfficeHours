package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TitleAndUrlCheck {

    public static void main(String[] args) {

 /*
    TC #2: Title and Url check
1. Open Firefox browser
2. Go to https://www.facebook.com
3. Verify url contains facebook
4. Verify title contains Facebook
5. Navigate to https://www.google.com
6. Verify url contains google
7. Verify title contains Google
8. Navigate back
9. Verify url contains facebook
10.Navigate forward
11.Verify url contains google
     */

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com");

        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("facebook url verification passed!");
        } else {
            System.out.println("facebook url verification failed!");
        }

//
        if (driver.getTitle().contains("Facebook")){
            System.out.println("facebook title verification passed!");
        } else {
            System.out.println("facebook title verification failed!");
        }

        driver.navigate().to("https://www.google.com"); // to google

        if (driver.getCurrentUrl().contains("google")){
            System.out.println("google url verification passed!");
        } else {
            System.out.println("google url verification failed!");
        }

        if (driver.getTitle().contains("Google")){
            System.out.println("google title verification passed!");
        } else {
            System.out.println("google title verification failed!");
        }

        driver.navigate().back(); // back to facebook

        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("facebook url verification passed!");
        } else {
            System.out.println("facebook url verification failed!");
        }

        driver.navigate().forward(); // to google

        if (driver.getCurrentUrl().contains("google")){
            System.out.println("google url verification passed!");
        } else {
            System.out.println("google url verification failed!");
        }







    }
}
