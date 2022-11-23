package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

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


    public void commentOnNewsArticalandcatchtheText()
    {

        clickOnElement(_homePageButton);
        clickOnElement(_newsArtical);// to click on news items.
        type(_newsTitle,"Excellent New Items"); // to comment on news
        type(_newsComments,"Good new items on this site"); // to type a message for news share.
        clickOnElement(_shareNewsButton); //to share news click button share.

        String newsTitle = getTextFromElement(_newsTitle);

      //  Assert.assertTrue(_newsTitle.toString().contains("Excellent"),"News Comment Title");
        Assert.assertTrue(getTextFromElement(_newsTitle).contains("Excellent"),"News Comment Title");

      //  List<WebElement> CommentList = clickOnElement(_commentContent);
        /*String readMsg = getTextFromElement(_redMsg);// to print registration confirmation.
        System.out.println("\n"+readMsg+"\n"+"Test time and date:"+timeStamp()); // to print registration confirmation with timestamp.*/

    }


}
