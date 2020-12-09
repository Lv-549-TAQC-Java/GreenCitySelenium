package com.greencity.pages;

import com.greencity.locators.CreateNewsPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.InputTextField;
import org.openqa.selenium.WebDriver;


public class CreateNewsPage extends BasePage{
    private InputTextField contentNews;
    private InputTextField titleNews;
    private Button cancelButton;
    private Button previewButton;
    private Button publishButton;

    public CreateNewsPage(WebDriver driver) {
        super(driver);
    }

    public InputTextField getTitleNews() {

        return titleNews = new InputTextField(driver, CreateNewsPageLocators.TITLE_NEWS);
    }

    public InputTextField getContentNews() {

        return contentNews = new InputTextField(driver, CreateNewsPageLocators.CONTENT_NEWS);
    }

    public Button getCancelButton() {
        return cancelButton =  new Button(driver, CreateNewsPageLocators.CANCEL_BUTTON);
    }

    public Button getPreviewButton() {

        return previewButton =  new Button(driver, CreateNewsPageLocators.PREVIEW_BUTTON);
    }

    public Button getPublishButton() {

        return publishButton = new Button(driver, CreateNewsPageLocators.PUBLISH_BUTTON);
    }
}