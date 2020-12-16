package com.greencity.pages;

import com.greencity.locators.RegisterPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.InputTextField;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private InputTextField email;
    private InputTextField firstName;
    private InputTextField password;
    private InputTextField repeatPassword;
    private Button submitButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public InputTextField getEmail() {
        return email = new InputTextField(driver, RegisterPageLocators.EMAIL);
    }

    public InputTextField getFirstName() {
        return firstName = new InputTextField(driver, RegisterPageLocators.FIRST_NAME);
    }

    public InputTextField getPassword() {
        return password = new InputTextField(driver, RegisterPageLocators.PASSWORD);
    }

    public InputTextField getRepeatPassword() {
        return repeatPassword = new InputTextField(driver, RegisterPageLocators.CONFIRM_PASSWORD);
    }

    public Button getSubmitButton() {
        return submitButton = new Button(driver, RegisterPageLocators.SUBMIT_BUTTON);
    }
}
