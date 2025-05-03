package com.cg.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForClick
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://doodles.google/search/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement searchDoodles = driver.findElement(By.xpath("//input[@class = \"search-doodle__box-input\"]"));
        Thread.sleep(3000);
        searchDoodles.clear();
        Thread.sleep(3000);
        searchDoodles.sendKeys("Hello world", Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();
    }
}
