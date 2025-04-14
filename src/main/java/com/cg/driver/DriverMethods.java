package com.cg.driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;

public class DriverMethods
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement imFeelingLucky = driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[last()]"));
        imFeelingLucky.click();
        Thread.sleep(1000);
        WebElement about = driver.findElement(By.xpath("(//a[contains(text(),\"About\")])[1]"));
        about.click();
        Thread.sleep(1000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(1000);
        WebElement library = driver.findElement(By.xpath("(//a[@data-g-cta_text=\"Library\"])[2]"));
        library.click();
        Thread.sleep(1000);
        WebElement searchDoodles = driver.findElement(By.xpath("//input[@class = \"search-doodle__box-input\"]"));
        System.out.println(searchDoodles.getText());
        Thread.sleep(1000);
        searchDoodles.clear();
        Thread.sleep(1000);
        searchDoodles.sendKeys("Hello world", Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();
    }
}
