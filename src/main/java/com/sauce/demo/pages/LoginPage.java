package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

   // By usernameField = By.xpath("//input[@id='user-name']");
By usernameField=By.xpath("//input[@id='user-name']");
    public void getUserField(String username) {
        sendTextToElement(usernameField,username);
    }

    By passwordField = By.xpath("//input[@id='password']");

    public void getPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    By loginButton = By.xpath("//input[@class='submit-button btn_action']");

    public void getloginButton() {
        clickOnElement(loginButton);
    }

    By verifyText = By.xpath("//span[contains(text(),'Products')]");

    //Verify the text “PRODUCTS”
    public String getVerifyText() {
        return getTextFromElement(verifyText);
    }

    By inventoryDisplayed = By.id("inventory_container");

    public void inventoryDisplay() {
        if (driver.findElement(inventoryDisplayed).isDisplayed() == true) {
            System.out.println("true");


        } else {
            System.out.println("no product displayed");
        }

    }
}

