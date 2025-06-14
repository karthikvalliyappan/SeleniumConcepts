package com.cg.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GetCityForCountry
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows)
        {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            String expectedCountry = "India";
            if(columns.size()>=2)
            {
                String actualCountry = columns.get(1).getText();
                if (actualCountry.equals(expectedCountry))
                {
                    System.out.println("City for " + actualCountry + " Is: " + columns.get(2).getText());
                }
            }
        }
        driver.quit();
    }
}
