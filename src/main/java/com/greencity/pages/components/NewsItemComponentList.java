package com.greencity.pages.components;

import com.greencity.pages.BasePage;
import com.greencity.pages.EcoNewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
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
        new EcoNewsPage(driver).scrollToEndOfPage();
        List<WebElement> itemWebElemList = driver.findElements(By.cssSelector("app-news-list-gallery-view > div"));
        System.out.println("itemWebElemList-" + itemWebElemList.size());
        for (WebElement item : itemWebElemList) {
            newsList.add(new NewsItemComponent(item));
        }
    }

    public List<NewsItemComponent> getNewsList() {
        return newsList;
    }

    public int getNumbOfNewsItemOnThePage() {
        return newsList.size();
    }
    public NewsItemComponent findNewsItemByTitle(String title){
        for (NewsItemComponent newsItem:newsList){
            if (newsItem.getTitle().getText().equals(title)){
                return newsItem;
            }
        }
       throw new RuntimeException("there is no news on the page with such a title-"+title);
    }
}
