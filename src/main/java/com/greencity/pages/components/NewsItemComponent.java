package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsItemComponent {
    WebElement img;
    List<WebElement> categoryList;
    WebElement title;
    WebElement description;
    WebElement createdDate;
    WebElement author;

    public NewsItemComponent(WebElement container) {

    }

    private void initElem(WebElement container){
        img= container.findElement(By.className("list-image-content"));
        categoryList=container.findElements(By.className("ul-eco-buttons.ng-star-inserted"));
        title=container.findElement(By.className("title-list.word-wrap"));
        description=container.findElement(By.className("list-text.word-wrap"));
       // createdDate=container.findElement(By.className("user-data-text-date"))
    }
}
