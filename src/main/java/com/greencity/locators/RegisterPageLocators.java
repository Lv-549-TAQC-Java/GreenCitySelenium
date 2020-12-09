package com.greencity.locators;

import org.openqa.selenium.By;

public enum RegisterPageLocators implements BaseLocator{

    TEMP(By.cssSelector("wdwdwd]"));


    private By path;

    RegisterPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
