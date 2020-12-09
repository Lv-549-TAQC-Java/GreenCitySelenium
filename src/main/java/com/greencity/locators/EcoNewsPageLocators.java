package com.greencity.locators;

import org.openqa.selenium.By;

public enum EcoNewsPageLocators implements BaseLocator {

    TITLE_ITEMS_FOUND(By.cssSelector("app-remaining-count > p"));
    private By path;

    EcoNewsPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
