package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils
{
    private By _registerButton = By.className("ico-register");
    private By _navigateToHomePage = By.xpath("//img[@alt='nopCommerce demo store']");




    public void clickOnRegisterButton()
    {
        clickOnElement(_registerButton); // to click on the register button at homepage.
    }

    public void toVerifyUserisonRegisterationPage() // Verify that the user is on the registration page.
    {
        {
            clickOnElement(_registerButton);
            Assert.assertTrue(driver.getCurrentUrl().contains("register"),"Registration page not found");
            Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnUrl=%2F","UrL for Registration details Page");
        }
    }

    public void navigateToFacebook()
    {

        clickOnElement(_navigateToHomePage);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"),"HomePage Url for DemoNopCommerce");

    }

}
