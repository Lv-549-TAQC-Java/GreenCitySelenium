package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsItemComponent {
    private WebElement img;
    private List<WebElement> categoryList;
    private WebElement title;
    private WebElement description;
    private WebElement createdDate;
    private WebElement author;
    private final WebElement container;
    public NewsItemComponent(WebElement container) {
        this.container=container;
        initElem();
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

    public void click(){
       container.click();
    }

    private void initElem() {
        img = container.findElement(By.cssSelector("div.list-image"));
        categoryList = container.findElements(By.cssSelector("div.filter-tag > div"));
        title = container.findElement(By.cssSelector("div.title-list"));
        description = container.findElement(By.cssSelector("div.list-text"));
        List<WebElement> userDataList = container.findElements(By.cssSelector("div.user-data-added-news > p"));
        createdDate = userDataList.get(0);
        author = userDataList.get(1);
    }
}
