package com.greencity.pages.components;

import com.greencity.locators.NewsItemComponentLocators;
import com.greencity.pageelements.Image;
import com.greencity.pageelements.TextField;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewsItemComponent {
    private Image img;
    private List<TextField> categoryList;
    private TextField title;
    private TextField description;
    private TextField createdDate;
    private TextField author;
    private final WebElement container;

    public NewsItemComponent(WebElement container) {
        this.container = container;
        initElem();
    }

    public Image getImg() {
        return img;
    }

    public List<TextField> getCategoryList() {
        return categoryList;
    }

    public TextField getTitle() {
        return title;
    }

    public TextField getDescription() {
        return description;
    }

    public TextField getCreatedDate() {
        return createdDate;
    }

    public TextField getAuthor() {
        return author;
    }

    public void click() {
        container.click();
    }

    private void initElem() {
        img = new Image(container, NewsItemComponentLocators.IMG);
        categoryList = new ArrayList<>();
        List<WebElement> webElements = container.findElements(NewsItemComponentLocators.CATEGORY_LIST.getPath());
        for (WebElement w : webElements) {
            categoryList.add(new TextField(w));
        }
        title = new TextField(container, NewsItemComponentLocators.TITLE);
        description = new TextField(container, NewsItemComponentLocators.DESCRIPTION);
        List<WebElement> userDataList = container.findElements(NewsItemComponentLocators.USER_DATA_LIST.getPath());
        createdDate = new TextField(userDataList.get(0));
        author = new TextField(userDataList.get(1));
    }
}
