package com.greencity.locators;

import org.openqa.selenium.By;

public enum CommentComponentLocators implements BaseLocator {
    AUTHOR_NAME(By.cssSelector("div.author-name > span")),
    COMMENT_TEXT(By.cssSelector("div.comment-main-text > p")),
    COMMENT_DATE(By.className("comment-date-month"));

    private By path;

    CommentComponentLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
