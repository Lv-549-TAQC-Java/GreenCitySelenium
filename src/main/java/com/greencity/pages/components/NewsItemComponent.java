package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsItemComponent {
    private final WebElement container;

    public NewsItemComponent(WebElement container) {
        this.container=container;
    }

    public WebElement getImg() {
        return this.container.findElement(By.cssSelector("div.list-image"));
    }

    public List<WebElement> getCategoryList() {
        return this.container.findElements(By.cssSelector("div.filter-tag > div"));
    }

    public WebElement getTitle() {
        return this.container.findElement(By.cssSelector("div.title-list"));
    }

    public WebElement getDescription() {
        return this.container.findElement(By.cssSelector("div.list-text"));
    }

    public List<WebElement> getUserDateList(){
        return this.container.findElements(By.cssSelector("div.user-data-added-news > p"));
    }

    public void click(){
       container.click();
    }
}
