package com.greencity.pages.components;

import com.greencity.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsItemComponentList extends BasePage {
    WebElement itemNewsElem;
    List<NewsItemComponent> newsList;

    public NewsItemComponentList(WebDriver driver, WebElement itemNewsElem) {
        super(driver);
        this.itemNewsElem=itemNewsElem;
    }

    private void initElem() {

    }

}
