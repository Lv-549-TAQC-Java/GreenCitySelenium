package com.greencity.pages;

import com.greencity.pageelements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage{
    private WebElement signUpButton;
    private WebElement signInButton;
    private Button ecoNewsButton;


    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public Button getEcoNewsButton(){
        return ecoNewsButton = new Button(driver,".navigation-menu-left [href='\\\\/GreenCityClient\\\\/news']");
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
