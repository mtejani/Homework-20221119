package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertVote extends Utils
  {
        private By _voteButton =By.id("vote-poll-1");

       public void acceptIfAlertPresent()
     {
        clickOnElement(_voteButton);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try
        {
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();

            alert.accept();

        }

        catch (Exception exc)
        {
            System.out.println("No alert");
        }

     }

  }
