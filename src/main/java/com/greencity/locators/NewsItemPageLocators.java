package com.greencity.locators;

import org.openqa.selenium.By;

public enum NewsItemPageLocators implements BaseLocator {
    BACK_TO_NEWS_BUTTON(By.cssSelector(".button-link > .button-content")),
    ITEM_CATEGORY_TAG(By.cssSelector(".tags")),
    NEWS_TITLE(By.cssSelector(".news-title-container")),
    DATE_INFO(By.cssSelector(".news-info-date")),
    AUTHOR_INFO(By.cssSelector(".news-info-author")),
    IMAGE(By.cssSelector("img[alt='news-image']")),
    TEXT_CONTENT(By.cssSelector(".news-text-content.word-wrap")),
    SOURCE_LINK(By.cssSelector(".source-text.word-wrap")),
    SOCIAL_NETWORKING_SITES(By.className("news-links-img")),
    COMMENT(By.cssSelector("app-comments-list .comment-body-wrapper.ng-star-inserted")),
    COMMENT_FORM(By.cssSelector("app-eco-news-detail .wrapper:nth-of-type(3)"));

    private By path;

    NewsItemPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
