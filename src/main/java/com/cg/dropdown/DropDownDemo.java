package com.cg.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.xpath("//select[@id = 'country']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", dropDown);
        Thread.sleep(3000);

        Select select = new Select(dropDown);
        select.selectByVisibleText("Angola");
        List<WebElement> optionsList = select.getOptions();
        for(WebElement data : optionsList)
        {
            System.out.println(data.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
