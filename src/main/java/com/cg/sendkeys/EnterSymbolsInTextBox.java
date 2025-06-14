package com.cg.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterSymbolsInTextBox
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://doodles.google/search/");
        Thread.sleep(2000);
        WebElement textbox = driver.findElement(By.xpath("//input[@placeholder = 'Search Doodles']"));
        textbox.sendKeys(Keys.ARROW_UP);
        Thread.sleep(2000);
        textbox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.quit();
    }
}
