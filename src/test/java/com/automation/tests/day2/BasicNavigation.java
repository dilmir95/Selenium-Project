package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        //to start selenium script we need:
        //setup webdriver and create webdriver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // in selenium everything starts from WebDriver interface

        driver.get("http://google.com"); //to open a website
        driver.manage().window().maximize();




        Thread.sleep(5000); // wait 5 seconds
        String title = driver.getTitle(); //returns the title of the page;
        String expected = "Google";
        if(title.equals(expected)){
            System.out.println("Test passed");
        }else{
            System.out.println("test failed");
        }
        driver.navigate().to("http://amazon.com");
        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        verifyEquals(driver.getTitle(),"Google");

        System.out.println(driver.getCurrentUrl());

        driver.close(); // to close browser

    }

    public static void verifyEquals(String arg1 , String arg2){
        if(arg1.equals(arg2)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
    }
}
