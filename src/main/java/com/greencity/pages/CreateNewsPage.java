package com.greencity.pages;

import com.greencity.locators.CreateNewsPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewsPage extends BasePage{
    private CreateNewsPageLocators contentNews;
    private CreateNewsPageLocators titleNews;
    private CreateNewsPageLocators cancelButton;
    private CreateNewsPageLocators previewButton;
    private CreateNewsPageLocators publishButton;

    public CreateNewsPage(WebDriver driver) {
        super(driver);
    }

    public CreateNewsPageLocators getTitleNews() {
        return titleNews = CreateNewsPageLocators.TITLE_NEWS;
    }

    public CreateNewsPageLocators getContentNews() {
        return contentNews = CreateNewsPageLocators.CONTENT_NEWS;
    }

    public CreateNewsPageLocators getCancelButton() {
        return cancelButton = CreateNewsPageLocators.CANCEL_BUTTON;
    }

    public CreateNewsPageLocators getPreviewButton() {
        return previewButton = CreateNewsPageLocators.PREVIEW_BUTTON;
    }

    public CreateNewsPageLocators getPublishButton() {
        return publishButton = CreateNewsPageLocators.PUBLISH_BUTTON;
    }
}