package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage{
    private WebElement signUpButton;
    private WebElement signInButton;
    private WebElement ecoNewsButton;

    public WebElement getEcoNewsButton(){
        return ecoNewsButton = driver
                .findElement(By.cssSelector(".navigation-menu-left [href='\\/GreenCityClient\\/news']"));
    }

    public WebElement getSignUpButton() {
        return signUpButton = driver
                .findElement(By.cssSelector("* li.sign-up-link.ng-star-inserted > div"));
    }

    public WebElement getSignInButton() {
        return signInButton = driver
                .findElement(By.cssSelector("* .sign-in-link>a"));
    }
}
