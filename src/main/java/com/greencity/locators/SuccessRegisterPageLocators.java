package com.greencity.locators;

import org.openqa.selenium.By;

public enum SuccessRegisterPageLocators implements BaseLocator {
    TEMP(By.cssSelector("wdwdwd]"));


    private By path;

    SuccessRegisterPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
