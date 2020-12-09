package com.greencity.pages;

import com.greencity.pages.components.NewsItemComponent;
import com.greencity.utils.ScrollPageDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class EcoNewsPage extends BasePage {
    private WebElement tagButtons;
    private WebElement CreateNews;
    private List<NewsItemComponent> newsList;

    public EcoNewsPage(WebDriver driver) {
        super(driver);
    }

    public List<NewsItemComponent> getNewsList() {
        newsList = new ArrayList<NewsItemComponent>();
        (new ScrollPageDown(driver)).scrollToEndOfPage();
        List<WebElement> itemWebElemList = driver.findElements(By.cssSelector("app-news-list-gallery-view > div"));
        for (WebElement item : itemWebElemList) {
            newsList.add(new NewsItemComponent(item));
        }
        return newsList;
    }

    public List<WebElement> getTagButtons() {
        List<WebElement> tagButtons = driver
                .findElements(By.cssSelector("a li"));
        System.out.println("tagButtons size:" + tagButtons.size());
        return tagButtons;
    }

    public WebElement getCreateNews() {
        return CreateNews = driver
                .findElement(By.cssSelector("a div"));
    }
}
