package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class FaceBookPage extends Utils
{
    HomePage homePage = new HomePage();

    public void verifytoFacebookpage()
    {

        String expectedFacebook = "https://www.facebook.com/nopCommerce";
        String expectedurlhome = "https://demo.nopcommerce.com/";
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window
        clickOnElement(By.linkText("Facebook"));
        // Switch to new window opened
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }

        // Perform the actions on new window

        Assert.assertEquals(driver.getCurrentUrl(),expectedFacebook,"Expected as Facebook url");

        // Close the new window, if that window no more required
                driver.close();

        // Switch back to original browser (first window)
                driver.switchTo().window(winHandleBefore);
        Assert.assertEquals(driver.getCurrentUrl(),expectedurlhome,"Your home url");

    }
}
