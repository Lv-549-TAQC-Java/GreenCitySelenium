package com.greencity.steps;

import com.greencity.pageelements.Button;
import com.greencity.pages.HeaderPage;
import org.openqa.selenium.WebDriver;

public class HeaderPageBL {
    private HeaderPage headerPage;
    protected WebDriver driver;

    public HeaderPageBL(WebDriver driver) {
        this.driver = driver;
        headerPage = new HeaderPage(driver);
    }

    public RegisterPageBL clickOnSignUpButton() {
        headerPage.getSignUpLink().click();
        return new RegisterPageBL(driver);
    }

    public EcoNewsPageBL clickOnEcoNewsButton() {
        Button element = headerPage.getEcoNewsButton();
        if (element.isClickable()) {
            element.click();
        }
        return new EcoNewsPageBL(driver);
    }

    public SingInPageBL clickOnSignInButton() {
        headerPage.getSignInLink().click();
        return new SingInPageBL(driver);
    }
}