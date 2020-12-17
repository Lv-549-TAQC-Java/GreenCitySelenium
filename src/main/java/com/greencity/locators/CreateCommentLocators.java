package com.greencity.locators;

import org.openqa.selenium.By;

public enum CreateCommentLocators implements BaseLocator {
    COMMENT_TEXT(By.cssSelector("textarea")),
    COMMENT_BUTTON(By.cssSelector(".primary-global-button"));

    private By path;

    CreateCommentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
