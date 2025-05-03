package com.cg.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInToElement
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://doodles.google/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement nextButton = driver.findElement(By.xpath("//button[@class='quiz-button interactive']"));
        //true means, the element will appear at the top of the screen
        //false means, the element will appear at the bottom of the screen
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",nextButton);
        Thread.sleep(1000);
        nextButton.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
