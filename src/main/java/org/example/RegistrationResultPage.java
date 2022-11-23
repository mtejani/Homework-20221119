package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils
{
    String expectedRegistrationText  = "Your registration completed";
    public void toVerifyUserHasBeenSuccessfullyRegistered()
    {


        By _redmsg = By.className("result");
        waitForUrlTobe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",10);
        String registerResulMessage =  getTextFromElement(_redmsg);
        System.out.println(registerResulMessage);

        //verifying register message is as expected
        Assert.assertEquals(registerResulMessage , expectedRegistrationText);

    }

}
