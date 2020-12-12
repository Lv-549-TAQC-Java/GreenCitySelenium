package com.greencity.locators;

import org.openqa.selenium.By;

public enum CreteNewsPageLocators implements BaseLocator {
    TEMP(By.cssSelector("wdawddasda"));


    private By path;

    CreteNewsPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
