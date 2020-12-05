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
        img = container.findElement(By.className("list-image-content"));
        categoryList = container.findElements(By.className("ul-eco-buttons"));
        title = container.findElement(By.className("title-list"));
        description = container.findElement(By.cssSelector("div.list-text.word-wrap"));
        List<WebElement> userDateList = container.findElements(By.className("user-data-text-date"));
        createdDate = userDateList.get(0);
        author = userDateList.get(1);
    }

}
