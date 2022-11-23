package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils
{

    // parameter for register button
    private By _registerButton = By.className("ico-register");
    // parameter for first name
    private By _firtNameField = By.id("FirstName");
    // parameter for gender
    private By _maleFemaleRadioButton = By.id("gender-male"); // parameter for gender
    private By _lastNameField = By.id("LastName"); // parameter for last name
    private By _selectBirthday = By.name("DateOfBirthDay"); // parameter for birthdate
    private By _selectBirthMonth = By.name("DateOfBirthMonth"); // parameter for birthmonth
    private By _selectBirthYear = By.name("DateOfBirthYear"); // parameter for birthyear
    private By _emailField = By.id("Email"); // parameter for email field
    private By _companyNameField = By.id("Company"); // parameter for company name
    private By _passwordField = By.id("Password"); // parameter for password
    private By _passwordConfirmField = By.id("ConfirmPassword"); // parameter for reconfirmation of passwords.
    private By _registerSubmitButton = By.id("register-button"); // parameter for register butt
    private By _readMsg = By.className("result"); // parameter for register button





    public void enterRegistrationDetails()
    {
        waitForElementToBeClickable(_registerButton,10);//clicking on the button register
        //clickOnElement(_maleFemaleRadioButton,"gender-male");
        clickOnElement(_maleFemaleRadioButton); //select the gender.
        type(_firtNameField,"Mak"); // First Name
        type(_lastNameField,"Patel"); // Last Name
        selectFromDropdownByIndex(_selectBirthday,7); //select birthday date.
        selectFromDropdownByValue(_selectBirthMonth,"5"); //select birthday month.
        selectFromDropdownByValue(_selectBirthYear,"2001"); //select birthday year.
        type(_companyNameField,"MT Software Plc"); // company name
        type(_emailField,"Mak"+timeStamp()+"esg"+"@email.com"); //user email address.
        type(_passwordField,"Mux1@12112"); // create a password
        type(_passwordConfirmField,"Mux1@12112"); // reconfirm the password.
        clickOnElement(_registerSubmitButton); // click on the registration button for registration.
        String redMsg = getTextFromElement(_readMsg); // to print registration confirmation.

        System.out.println("\n"+redMsg +"\n"+"Date and time at time of test completed:"+timeStamp()); // to print registration confirmation with timestamp.

    }



}
