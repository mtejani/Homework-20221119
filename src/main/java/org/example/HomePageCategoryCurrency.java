package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;

import java.util.List;

public class HomePageCategoryCurrency extends Utils {

    private By _selectCurrency = By.id("customerCurrency");
    // private By _selectedEuroCurrency = By.linkText("Euro");
    private By _homePageItem = By.className("product-title");
    private By _priceList = By.className("prices");


    public void webElementslistwithPricelist()
    {
        List<WebElement> ProductList = driver.findElements(_homePageItem);
        List<WebElement> ProductPrice = driver.findElements(_priceList);
        System.out.println("Number of Products: " + ProductList.size());
        System.out.println("Number of Products: " + ProductPrice.size());
        for (WebElement product : ProductList) {
            System.out.println("Name + No: " + product.getText());
        }
        for (WebElement price : ProductPrice) {
            System.out.println("Product price: " + price.getText());
        }
    }
    public void verifyHomePageFeaturedProductsInUSD()
    {
       selectFromDropdownByVisibleText(_selectCurrency, "US Dollar");
       webElementslistwithPricelist();
       Assert.assertTrue(getTextFromElement(_priceList).contains("$"),"USD Selected");
    }

    public void verifyHomePageFeaturedProductsInEuro()
    {
        selectFromDropdownByVisibleText(_selectCurrency, "Euro");
        webElementslistwithPricelist();
        Assert.assertTrue(getTextFromElement(_priceList).contains("€"),"USD Selected");
    }


}

