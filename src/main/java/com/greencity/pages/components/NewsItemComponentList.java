package com.greencity.pages.components;

import com.greencity.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewsItemComponentList extends BasePage {
    List<NewsItemComponent> newsList;
    int numbOfNewsItemOnThePage;

    public NewsItemComponentList(WebDriver driver)  {
        super(driver);
            initElem();
    }

    private void initElem() {
        newsList=new ArrayList<>();
     List<WebElement> itemWebElemList=driver.findElements(By.cssSelector("app-news-list-gallery-view > div"));
     for (WebElement item:itemWebElemList){
         newsList.add(new NewsItemComponent(item));
     }
     numbOfNewsItemOnThePage=newsList.size();
    }

    public List<NewsItemComponent> getNewsList() {
        return newsList;
    }

    public int getNumbOfNewsItemOnThePage() {
        return numbOfNewsItemOnThePage;
    }
}
