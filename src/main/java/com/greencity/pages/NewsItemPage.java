package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewsItemPage extends BasePage{
    private WebElement backToNewsButton;
    private WebElement itemCategoryTag;
    private WebElement newsTitle;
    private WebElement dateInfo;
    private WebElement authorInfo;
    private WebElement image;
    private WebElement textContent;
    private WebElement sourceField;
    private WebElement socialNetworkingLink;
    private WebElement mayBeInterestingForYouNewsItem;


    public WebElement getBackToNewsButton() {
        return backToNewsButton = driver
                .findElement(By.cssSelector(".button-link > .button-content"));
    }

    public WebElement getItemCategoryTag() {
        return itemCategoryTag = driver
                .findElement(By.cssSelector(".tags"));
    }
    public WebElement getNewsTitle(){
        return newsTitle = driver
                .findElement(By.cssSelector(".news-title-container"));
    }

    public WebElement getDateInfo() {
        return dateInfo= driver
                .findElement(By.cssSelector(".news-info-date"));
    }

    public WebElement getAuthorInfo() {
        return authorInfo = driver
                .findElement(By.cssSelector(".news-info-author"));
    }

    public WebElement getImage() {
        return image = driver
                .findElement(By.cssSelector("img[alt='news-image']"));
    }

    public WebElement getTextContent() {
        return textContent = driver
                .findElement(By.cssSelector("img[alt='news-image']"));
    }

    public WebElement getSourceField() {
        return sourceField = driver
                .findElement(By.cssSelector(".source-text.word-wrap"));
    }

    public WebElement getSocialNetworkingLink(int chooseSocialNetworkLink) {
        return socialNetworkingLink = driver
                .findElement(By.cssSelector(".news-links-images > a:nth-of-type("+chooseSocialNetworkLink+")"));
    }

    public WebElement getMayBeInterestingForYouNewsItem(int chooseNewsItem) {
        return mayBeInterestingForYouNewsItem = driver
                .findElement(By.cssSelector(".list > li:nth-of-type("+chooseNewsItem+")"));
    }
}
