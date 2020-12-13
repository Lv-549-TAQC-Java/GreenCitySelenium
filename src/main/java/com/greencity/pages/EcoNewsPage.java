package com.greencity.pages;

import com.greencity.locators.EcoNewsPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.TextField;
import com.greencity.pages.components.NewsItemComponent;
import com.greencity.utils.ScrollPageDown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class EcoNewsPage extends BasePage {
    private Button createNews;
    private List<Button> filterTegList;
    private TextField countItemsFound;
    private List<NewsItemComponent> newsList;

    public EcoNewsPage(WebDriver driver) {
        super(driver);
    }

    public List<NewsItemComponent> getNewsList() {
        newsList = new ArrayList<>();
        (new ScrollPageDown(driver)).scrollToEndOfPage();
        List<WebElement> itemWebElemList = driver.findElements(EcoNewsPageLocators.NEWS_ITEM.getPath());
        for (WebElement item : itemWebElemList) {
            newsList.add(new NewsItemComponent(item));
        }
        return newsList;
    }

    public Button getCreateNews() {
        return createNews = new Button(driver, EcoNewsPageLocators.CREATE_NEWS);
    }

    public List<Button> getFilterTegList() {
        List<WebElement> webElemTegFilter = driver.findElements(EcoNewsPageLocators.FILTER_TEG.getPath());
        for (WebElement element : webElemTegFilter) {
            filterTegList.add(new Button(element));
        }
        return filterTegList;
    }

    public TextField getCountItemsFound() {
        return countItemsFound = new TextField(driver, EcoNewsPageLocators.TITLE_ITEMS_FOUND);
    }
}
