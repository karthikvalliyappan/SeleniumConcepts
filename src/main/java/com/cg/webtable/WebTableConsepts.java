package com.cg.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTableConsepts
{
   // fetch all rows thrird collumn

    //table[@id ='countries']//tr//child::td[3]
    //table[@id='countries']//tr//td[3]

    // fetch first rows thrird collumn

    //table[@id ='countries']//tr[1]//child::td[3]

    // fetch first row all collumns
    //table[@id ='countries']//tr[1]//child::td

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> columnList = driver.findElements(By.xpath("//table[@id='countries']//tr//td[3]"));
        for(WebElement columnElement : columnList)
        {
            System.out.println(columnElement.getText());
        }
        driver.quit();
    }

}
