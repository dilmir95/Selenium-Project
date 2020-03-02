package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JumpToNewWindow {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        
        //every window has some id, this id called window handle
        //based on window handle we can switch between windows
        System.out.println("before switching"+ driver.getCurrentUrl());
        String windowHandle = driver.getWindowHandle();
        
        Set<String> windowHandls = driver.getWindowHandles();

        System.out.println("windowHandle = " + windowHandle);
        System.out.println("windowHandls = " + windowHandls);

        for(String windowId: windowHandls){
            if(!windowId.equals(windowHandle)){
                driver.switchTo().window(windowId);
                Thread.sleep(3000);
                driver.get("http://amazon.com");
                Thread.sleep(1000);
            }
        }
        System.out.println("after switching = " + driver.getCurrentUrl());
        driver.quit();
    }

    public static void switchToWindowBasedOnTitle(String pageTitle, WebDriver driver){
        Set<String > windows = driver.getWindowHandles();
        for(String window: windows){
            driver.switchTo().window(window);
            if(driver.getTitle().equals(pageTitle));

            break;
        }

    }
}
