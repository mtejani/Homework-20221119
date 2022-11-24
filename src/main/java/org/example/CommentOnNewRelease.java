package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CommentOnNewRelease extends Utils
{
    /*HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();*/

    private By _homePageButton = By.xpath("//img[@alt='nopCommerce demo store']");
    private By _newsArtical = By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");
    private By _newsTitle= By.id("AddNewComment_CommentTitle");
    private By _newsComments = By.id("AddNewComment_CommentText");
    private By _shareNewsButton = By.xpath("//div[@class='fieldset new-comment']/form/div[2]/button");
    private By _redMsg = By.xpath("//div[@class='result']");
    private By _commentContent = By.className("comment-content");
    private By _result = By.className("result");


    public void commentOnNewsArticalandcatchtheText()
    {

        clickOnElement(_homePageButton);
        clickOnElement(_newsArtical);
        type(_newsTitle,"Excellent New Items");
        type(_newsComments,"Good new items on this site");
        clickOnElement(_shareNewsButton);

       Assert.assertEquals(getTextFromElement(_result),"News comment is successfully added.","Comment posted successfully");

    }


}
