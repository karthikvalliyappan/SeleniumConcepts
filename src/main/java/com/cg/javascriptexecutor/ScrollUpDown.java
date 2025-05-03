package com.cg.javascriptexecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://doodles.google/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        javascriptExecutor.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        Thread.sleep(3000);
        driver.quit();
    }
}
