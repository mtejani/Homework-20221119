package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import javax.swing.*;

public class EmailAFriendAppleMacBook extends Utils
{

    private By _ShareResult = By.xpath("//div[@class='result']");
    private By _appleMacBook = By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']");
    private By _emailAFriendButton = By.className("email-a-friend");
    private By _friendsEmail = By.id("FriendEmail");
    private By _messageToFriend = By.id("PersonalMessage");
    private By _sendEmail = By.className("buttons");
    private By _getBackHome = By.xpath("//img[@alt='nopCommerce demo store']");
    public void emailAProductAppleMacBook()

    {
        clickOnElement(_getBackHome);
        clickOnElement(_appleMacBook);
        clickOnElement(_emailAFriendButton);
        type(_friendsEmail,"peoplesemail@email.com");
        type(_messageToFriend,"This is the item that you were waiting for");
        clickOnElement(_sendEmail);

        Assert.assertEquals(getTextFromElement(_ShareResult),"Your message has been sent.","Item Shared Successfully");

    }




}
