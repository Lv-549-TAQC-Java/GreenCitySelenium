package com.greencity.pages;


import com.greencity.locators.HeaderPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage{
    private Link signUp;
    private Link signIn;
    private Button ecoNewsButton;


    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public Button getEcoNewsButton(){
        return ecoNewsButton = new Button(driver, HeaderPageLocators.ECO_NEWS_BUTTON);
    }

    public Link getSignUpLink() {
        return signUp = new Link(driver, HeaderPageLocators.SIGN_UP);
    }

    public Link getSignInLink() {
        return signIn = new Link(driver, HeaderPageLocators.SIGN_IN);
    }
}
