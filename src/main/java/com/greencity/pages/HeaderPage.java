package com.greencity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    @FindBy(css = "* ul > li.sign-up-link.ng-star-inserted > div")
    private WebElement signUpButton;
    @FindBy(css = "* .sign-in-link>a")
    private WebElement signInButton;

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}
