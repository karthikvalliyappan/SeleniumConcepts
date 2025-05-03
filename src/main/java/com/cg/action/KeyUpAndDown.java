package com.cg.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndDown   // typing the letter in uppercase
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://doodles.google/search/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search Doodles']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();

        Thread.sleep(5000);
        driver.quit();
    }
}
