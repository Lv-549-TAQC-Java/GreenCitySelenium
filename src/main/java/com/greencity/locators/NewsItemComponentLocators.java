package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsItemComponentLocators implements BaseLocator {
    IMG(By.cssSelector("div.list-image")),
    CATEGORY_LIST(By.cssSelector("div.title-list")),
    TITLE(By.cssSelector("div.title-list")),
    DESCRIPTION(By.cssSelector("div.list-text")),
    USER_DATA_LIST(By.cssSelector("div.user-data-added-news > p"));

    private By path;

    NewsItemComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
