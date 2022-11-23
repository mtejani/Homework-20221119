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
 @Test
    public void commentOnNewsArtical()
    {
      //homePage.clickOnRegisterButton();  // to open home page
      //homePage.toVerifyUserisonRegisterationPage(); // to verify the correct homepage.
      //registerPage.enterRegistrationDetails(); // fill in the registration details.
      //registrationResultPage.toVerifyUserHasBeenSuccessfullyRegistered(); // verify the registration detail outcome.
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

}
