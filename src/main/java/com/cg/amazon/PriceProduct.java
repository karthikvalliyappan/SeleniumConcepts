package com.cg.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.List;

public class PriceProduct
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
        Thread.sleep(2000);
        List<WebElement> productList = driver.findElements(By.xpath("//h2[@class ='a-size-medium a-spacing-none a-color-base a-text-normal' or @class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"]//span\n"));
        List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        Thread.sleep(2000);
        System.out.println(productList.size());
        System.out.println(priceList.size());

        if(productList.size()==priceList.size())
        {
            for(int i = 0; i<productList.size();i++)
            {
                int amount = Integer.parseInt(priceList.get(i).getText().replaceAll("[^0-9]",""));

                if(amount>60000)
                {
                    System.out.println(productList.get(i).getText());
                    System.out.println(amount);
                }
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
