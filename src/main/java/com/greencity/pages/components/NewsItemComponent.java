package com.greencity.pages.components;

import com.greencity.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NewsItemComponent {
    private WebElement img;
    private List<WebElement> categoryList;
    private WebElement title;
    private WebElement description;
    private WebElement createdDate;
    private WebElement author;

    public NewsItemComponent(WebElement container) {
      initElem(container);
    }

    public WebElement getImg() {
        return img;
    }

    public List<WebElement> getCategoryList() {
        return categoryList;
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getCreatedDate() {
        return createdDate;
    }

    public WebElement getAuthor() {
        return author;
    }

    private void initElem(WebElement container) {
           img = container.findElement(By.cssSelector("div.list-image"));
           categoryList = container.findElements(By.cssSelector("div.filter-tag > div"));
           title = container.findElement(By.cssSelector("div.title-list"));
           description = container.findElement(By.cssSelector("div.list-text"));
           List<WebElement> userDataList = container.findElements(By.cssSelector("div.user-data-added-news > p"));
           createdDate = userDataList.get(0);
           author = userDataList.get(1);
    }

}
