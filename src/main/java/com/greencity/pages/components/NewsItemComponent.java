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
    }

    public Image getImg() {
        return img = new Image(container, NewsItemComponentLocators.IMG);
    }

    public List<TextField> getCategoryList() {
        categoryList = new ArrayList<>();
        List<WebElement> webElements = container.findElements(NewsItemComponentLocators.CATEGORY_LIST.getPath());
        for (WebElement w : webElements) {
            categoryList.add(new TextField(w));
        }
        return categoryList;
    }

    public TextField getTitle() {
        return title = new TextField(container, NewsItemComponentLocators.TITLE);
    }

    public TextField getDescription() {
        return description = new TextField(container, NewsItemComponentLocators.DESCRIPTION);
    }

    public TextField getCreatedDate() {
        return createdDate = new TextField(userDataList().get(0));
    }

    public TextField getAuthor() {
        return author = new TextField(userDataList().get(1));
    }

    public void click() {
        container.click();
    }

    private  List<WebElement> userDataList(){
        List<WebElement> userDataList = container.findElements(NewsItemComponentLocators.USER_DATA_LIST.getPath());
        return userDataList;
    }
}
