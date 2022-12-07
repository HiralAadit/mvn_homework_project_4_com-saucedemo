package com.sauce.demo.testsuite;

import com.sauce.demo.pages.LoginPage;
import com.sauce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.getUserField("standard_user");
        loginPage.getPasswordField("secret_sauce");
        loginPage.getloginButton();
        String expectedErrorMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getVerifyText(), expectedErrorMessage, "ErrorMessage not displayed");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        loginPage.getUserField("standard_user");
        loginPage.getPasswordField("secret_sauce");
        loginPage.getloginButton();
        loginPage.inventoryDisplay();


    }

}

