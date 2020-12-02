package com.greencity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "repeatPassword")
    private WebElement repeatPassword;
    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement submitButton;

    public WebElement getEmail() {
        return email;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getRepeatPassword() {
        return repeatPassword;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
