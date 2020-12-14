package com.greencity.pages.components;

import com.greencity.locators.CreateNewsPageLocators;
import com.greencity.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public final class Tags extends BasePage {
    private static Tags instance;
    private List<WebElement> tags;

    private Tags(WebDriver driver) {
        super(driver);
        tags = driver.findElements(CreateNewsPageLocators.TAGS_LIST.getPath());
    }


    public static Tags getInstance(WebDriver driver) {
        if (instance == null) {
            return new Tags(driver);
        }
        return instance;
    }

    public WebElement getNewsTag() {
        return instance.tags.get(0);
    }

    public WebElement getEventsTag() {

        return instance.tags.get(1);
    }

    public WebElement getEducationTag() {
        return instance.tags.get(2);
    }

    public WebElement getInitiativesTag() {

        return instance.tags.get(3);
    }

    public WebElement getAdsTag() {

        return instance.tags.get(4);
    }

}