package com.greencity.pages;

import com.greencity.locators.SingInPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.InputTextField;
import org.openqa.selenium.WebDriver;

public class SingInPage extends BasePage {

    private InputTextField emailForm;
    private InputTextField passwordForm;
    private Button singIn;

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    public InputTextField getEmailForm() {
        return emailForm = new InputTextField(driver, SingInPageLocators.EMAIL_FORM);
    }

    public InputTextField getPasswordForm() {
        return passwordForm = new InputTextField(driver, SingInPageLocators.PASSWORD_FORM);
    }

    public Button getSingIn() {
        return singIn = new Button(driver, SingInPageLocators.SING_IN);
    }
}