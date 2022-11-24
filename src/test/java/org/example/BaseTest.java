package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    DriverManager driverManager = new DriverManager();


    @BeforeMethod

    public void setup()
    {

       driverManager.openBrowser();

    }

   @AfterMethod

    public void tearDown(ITestResult result)
   {
       //condition to check if test fails
       if(!result.isSuccess())
       {
           //calling captureScreenShot Method
           captureScreenShot(result.getName());
       }
       //closeBrowser method is called with object
       driverManager.closeBrowser();

   }

}
