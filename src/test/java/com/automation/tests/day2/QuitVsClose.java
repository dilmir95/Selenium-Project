package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

    public static void main(String[] args) throws InterruptedException {

        //.close closes current window
        // .quit will close all windows

        //selenium can jump between windows
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);

        //driver.close();

        driver.quit();



    }
}
