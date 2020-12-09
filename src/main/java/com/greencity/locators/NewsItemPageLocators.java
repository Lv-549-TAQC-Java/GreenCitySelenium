package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsItemPageLocators implements  BaseLocator{
    TEMP(By.cssSelector("wdwad"));


    private By path;

    NewsItemPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
