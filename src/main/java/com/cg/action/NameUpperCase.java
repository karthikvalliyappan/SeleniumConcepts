package com.cg.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NameUpperCase
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://doodles.google/search/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search Doodles']"));

        Actions actions = new Actions(driver);

        String s = "hello";
        actions.click(element);
        for(char c : s.toCharArray())
        {
            Thread.sleep(3000);
            actions.keyDown(Keys.SHIFT)
                    .sendKeys(String.valueOf(c))
                    .keyUp(Keys.SHIFT);
        }
        actions.build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
