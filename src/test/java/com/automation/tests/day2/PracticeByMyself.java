package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeByMyself {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("http://amazon.com");

        if(chromeDriver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        WebElement cart = chromeDriver.findElement(By.id("nav-cart"));
        Thread.sleep(4000);

        cart.click();

        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());
        chromeDriver.getWindowHandles();

        System.out.println(chromeDriver.getTitle().equals("amazon"));


        chromeDriver.quit();










    }
}
