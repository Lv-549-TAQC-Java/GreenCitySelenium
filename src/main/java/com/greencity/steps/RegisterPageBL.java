package com.greencity.steps;

import com.greencity.datamodel.RegisterModel;
import com.greencity.pages.RegisterPage;
import com.greencity.pages.SuccessRegisterPage;
import com.greencity.repository.RegisterModelRepository;
//import com.thoughtworks.selenium.SeleneseTestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPageBL {
    //private static final SeleneseTestBase Assert = ;
    private RegisterPage registerPage;
    private SuccessRegisterPage successRegisterPage;
    protected WebDriver driver;

    public RegisterPageBL(WebDriver driver) {
        this.driver = driver;
        registerPage = new RegisterPage(driver);
    }

    public RegisterPageBL registerNewPerson() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        inputEmail(registerModel.getEmail());
        inputFirstName(registerModel.getFirstName());
        inputPassword(registerModel.getPassword());
        clickOnSubmittButton();

        successRegisterPage = new SuccessRegisterPage(driver);
        return this;
    }

    private void inputEmail(String email) {
        registerPage.getEmail().clear();
        registerPage.getEmail().sendKeys(email);
    }

    private void inputFirstName(String firstname) {
        registerPage.getFirstName().clear();
        registerPage.getFirstName().sendKeys(firstname);
    }


    private void inputPassword(String password) {
        registerPage.getPassword().clear();
        registerPage.getPassword().sendKeys(password);
        registerPage.getRepeatPassword().clear();
        registerPage.getRepeatPassword().sendKeys(password);
    }

    private RegisterPageBL clickOnSubmittButton() {
        registerPage.getSubmitButton().click();
        return this;
    }

    public void verifyUserRegistration() {
        String expectedMessage = "You have succesfully";
       Assert.assertEquals(successRegisterPage.getSuccessTitle().getText(),
               expectedMessage, "Incorrect page title");
    }
}
