package com.swaglabs.tests;

import Factory.WebDriverFactory;
import SwagLabs.pages.CartPage;
import SwagLabs.pages.HomePage;
import SwagLabs.pages.ProductPage;
import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.annotations.Test;

import static SwagLabs.Utils.WaitUtils.waitForElementToBeVisible;


public class Test1 {

    WebDriver driver ;

    @Test
    public void test1() {
        this.driver = WebDriverFactory.getDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        HomePage homePage = new HomePage();

        //CartPage cartPage= new CartPage();
        homePage.Login("kareem1234","1234");
        homePage.ChooseCategory("laptops");
        homePage.ChooseProduct("laptop2");
        ProductPage productPage = new ProductPage();
        productPage.clickAddToCart();
        homePage.NavigateTO("home");
        homePage.ChooseCategory("monitors");
        homePage.ChooseProduct("monitor1");
        productPage.clickAddToCart();
        homePage.NavigateTO("cart");
        CartPage cartPage = new CartPage();
        Assert.assertEquals(cartPage.ActualPrice(),cartPage.expectedPrice());
        cartPage.ClickPlaceOrderButton();
    }
}
