package com.greencity.locators;

import org.openqa.selenium.By;

public enum SingInPageLocators implements BaseLocator {
    EMAIL_FORM(By.id("email")),
    PASSWORD_FORM(By.id("password")),
    SING_IN(By.cssSelector(".ng-dirty.ng-star-inserted.ng-touched.ng-valid.sign-in-form > .primary-global-button"));

    private By path;

    SingInPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}