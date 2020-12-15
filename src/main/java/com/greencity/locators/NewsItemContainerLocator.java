package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsItemContainerLocator implements BaseLocator {
    IMAGE(By.cssSelector("div.list-image")),
    TITLE_TEXT(By.cssSelector("div.title-list")),
    DESCRIPTION(By.cssSelector("div.list-text"));
//todo: add other locators

    private By path;

    NewsItemContainerLocator(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

