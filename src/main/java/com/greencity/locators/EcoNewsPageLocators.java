package com.greencity.locators;

import org.openqa.selenium.By;

public enum EcoNewsPageLocators implements BaseLocator {
    CREATE_NEWS(By.id("create-button")),
    FILTER_TEG(By.className("custom-chip")),
    TITLE_ITEMS_FOUND(By.cssSelector("app-remaining-count > p")),
    NEWS_ITEM(By.className("gallery-view-li-active"));


    private By path;

    EcoNewsPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
