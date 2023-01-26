package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTest {

    public static void main(String[] args) {

        /*
    go to https://www.etsy.com/
    locate Help Center link and click
    verify that url contains "help"
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        WebElement helpCenter = driver.findElement(By.xpath("//span[.='Help Center']"));
        helpCenter.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        if (driver.getCurrentUrl().contains("help")){
            System.out.println("passed!");
        } else {
            System.out.println("failed!");
        }
    }
}
