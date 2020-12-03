package com.greencity.steps;

import com.greencity.pages.HeaderPage;

public class HeaderPageBL {
    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }
    public RegisterPageBL clickOnSignUpButton() {
        headerPage.getSignUpButton().click();
        return new RegisterPageBL();
    }
    public EcoNewsPageBL clickOnEcoNewsButton(){
        headerPage.getEcoNewsButton().click();
        return new EcoNewsPageBL();
    }
}
