package com.greencity.pages.components;

import com.greencity.locators.NewsItemContainerLocator;
import com.greencity.pageelements.Image;
import com.greencity.pageelements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsItemComponent {
    private Image img;
    private List<WebElement> categoryList;
    private TextField title;
    private TextField description;
    private List<WebElement> userDateList;
    private WebElement createdDate;
    private WebElement author;
    private final WebElement container;

    public NewsItemComponent(WebElement container) {
        this.container = container;
        initElem();
    }

    public Image getImg() {
        return img = new Image(container, NewsItemContainerLocator.IMAGE);
    }

    //todo: working with lists
    public List<WebElement> getCategoryList() {
        return categoryList = container.findElements(By.cssSelector("div.filter-tag > div"));
    }

    public TextField getTitle() {
        return title = new TextField(container, NewsItemContainerLocator.TITLE_TEXT);
    }

    public TextField getDescription() {
        return description = new TextField(container, NewsItemContainerLocator.DESCRIPTION);
    }

    public List<WebElement> getUserDateList() {
        createdDate = userDateList.get(0);
        author = userDateList.get(1);
        return userDateList = container.findElements(By.cssSelector("div.filter-tag > div"));
    }

    public void click() {
        container.click();
    }

    private void initElem() {
    }
}
