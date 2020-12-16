package com.greencity.steps;

import com.greencity.locators.HeaderPageLocators;
import com.greencity.pages.HeaderPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPageBL {
    private HeaderPage headerPage;
    protected WebDriver driver;

    public HeaderPageBL(WebDriver driver){
        this.driver = driver;
        headerPage = new HeaderPage(driver);
    }
    public RegisterPageBL clickOnSignUpButton() {
        headerPage.getSignUpLink().click();
        return new RegisterPageBL(driver);
    }
    public EcoNewsPageBL clickOnEcoNewsButton(){
        headerPage.getEcoNewsButton().click();
        return new EcoNewsPageBL(driver);
    }

    public SingInPageBL clickOnSignInButton() {
        headerPage.getSignInLink().click();
        return new SingInPageBL(driver);
    }
    public HeaderPageBL isClickable(HeaderPageLocators locator){
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator.getPath()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        return new HeaderPageBL(driver);
    }
}
