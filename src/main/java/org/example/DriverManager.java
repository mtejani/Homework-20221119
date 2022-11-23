package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils
{
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void closeBrowser()
    {
        driver.quit();
    }



}
