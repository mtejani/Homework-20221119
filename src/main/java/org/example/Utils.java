package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage
{
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static void type(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public static String timeStamp()
    {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
    }

    public static void waitForElementToBeClickable(By by, int second)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementToBeVisible(By by, int second)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public static void waitForUrlTobe(String url, int second)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        wait.until(ExpectedConditions.urlToBe(url));

    }

    public static void selectFromDropdownByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropdownByValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static void selectFromDropdownByIndex(By by,int index)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static void captureScreenShot(String scrShotSource)
    {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File ScrFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("src/ScreenShots/"+scrShotSource+timeStamp()+".jpg");
        try {
            FileUtils.copyFile(ScrFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
