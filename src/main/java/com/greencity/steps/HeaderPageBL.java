package com.greencity.steps;

import com.greencity.pages.HeaderPage;
import org.openqa.selenium.WebDriver;

public class HeaderPageBL {
    private HeaderPage headerPage;
    protected WebDriver driver;

    public HeaderPageBL(WebDriver driver){
        this.driver = driver;
        headerPage = new HeaderPage(driver);
    }
    public RegisterPageBL clickOnSignUpButton() {
        headerPage.getSignUpButton().click();
        return new RegisterPageBL(driver);
    }

    public EcoNewsPageBL clickOnEcoNewsButton(){
        headerPage.getEcoNewsButton().click();
        return new EcoNewsPageBL(driver);
    }

    public SingInPageBL clickOnSignInButton() {
        headerPage.getSignInButton().click();
        return new SingInPageBL(driver);
    }
}
