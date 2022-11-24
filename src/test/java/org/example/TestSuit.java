package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{

   RegisterPage registerPage = new RegisterPage();
   RegistrationResultPage registrationResultPage = new RegistrationResultPage();
   CommentOnNewRelease shareNewsArtical = new CommentOnNewRelease();
   HomePage homePage = new HomePage();
   HomePageCategoryCurrency homePageCategoryCurrency = new HomePageCategoryCurrency();
   FaceBookPage faceBookPage = new FaceBookPage();
   AlertVote alertVote = new AlertVote();
   EmailAFriendAppleMacBook emailAFriendAppleMacBook = new EmailAFriendAppleMacBook();
 @Test
    public void commentOnNewsArtical()
    {
      shareNewsArtical.commentOnNewsArticalandcatchtheText();
    }

 @Test
    public void toVerifytheHomepageCategoryItemPriceCurrencyInUSD()
    {

        homePageCategoryCurrency.verifyHomePageFeaturedProductsInUSD();
    }
 @Test
     public void toVerifytheHomepageCategoryItemPriceCurrencyInEuro()
     {

         homePageCategoryCurrency.verifyHomePageFeaturedProductsInEuro();
     }
@Test
     public void facebook()
    {
        homePage.navigateToFacebook();
        faceBookPage.verifytoFacebookpage();
    }

@Test
    public void aletAccept()
    {
        alertVote.acceptIfAlertPresent();
    }

@Test
    public void shareAppleMacbookToFriend()
    {
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        emailAFriendAppleMacBook.emailAProductAppleMacBook();

    }
}
