package com.greencity.locators;

import org.openqa.selenium.By;

public enum CreateNewsPageLocators implements BaseLocator {

     TITLE_NEWS(By.cssSelector(".left-form-column .ng-touched")),
     CONTENT_NEWS(By.cssSelector(".textarea-wrapper .ng-pristine")),
     CANCEL_BUTTON(By.className("cancel")),
     PREVIEW_BUTTON(By.cssSelector(".submit-buttons > button:nth-of-type(2)")),
     PUBLISH_BUTTON(By.cssSelector("button[type='submit']"));

    private By path;

    CreateNewsPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}