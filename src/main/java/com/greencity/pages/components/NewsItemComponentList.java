package com.greencity.pages.components;

import com.greencity.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

        //((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight)");
        // while (!driver.findElement(By.cssSelector("div > div.description")).isDisplayed()) {
        //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");
        while (true) {
            try {

                driver.findElement(By.cssSelector("div.description__title > h2"));
                break;

            } catch (Exception exception) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //  }

        List<WebElement> itemWebElemList = driver.findElements(By.cssSelector("app-news-list-gallery-view > div"));
        System.out.println("itemWebElemList-" + itemWebElemList.size());
        for (WebElement item : itemWebElemList) {
            // scrollIntoMiddleOfView(item);
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
