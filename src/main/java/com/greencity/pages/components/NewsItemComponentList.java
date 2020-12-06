package com.greencity.pages.components;

import com.greencity.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewsItemComponentList extends BasePage {
    List<NewsItemComponent> newsList;

    public NewsItemComponentList(WebDriver driver) {
        super(driver);
        initElem();
    }

    private void initElem() {
        newsList = new ArrayList<NewsItemComponent>();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> itemWebElemList = driver.findElements(By.cssSelector("app-news-list-gallery-view > div"));
        System.out.println("itemWebElemList-" + itemWebElemList.size());
        for (WebElement item : itemWebElemList) {
          scrollIntoMiddleOfView(item);
            newsList.add(new NewsItemComponent(item));
        }
    }

    public List<NewsItemComponent> getNewsList() {
        return newsList;
    }

    public int getNumbOfNewsItemOnThePage() {
        return newsList.size();
    }
}
