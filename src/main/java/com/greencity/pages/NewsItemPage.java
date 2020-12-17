package com.greencity.pages;

import com.greencity.locators.NewsItemPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.Image;
import com.greencity.pageelements.Link;
import com.greencity.pageelements.TextField;
import com.greencity.pages.components.CommentComponent;
import com.greencity.pages.components.CreateComment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewsItemPage extends BasePage{
    private Button backToNewsButton;
    private TextField itemCategoryTag;
    private TextField newsTitle;
    private TextField dateInfo;
    private TextField authorInfo;
    private Image image;
    private TextField textContent;
    private Link sourceLink;
    private List<Link> socialNetworkingSitesLink = new LinkedList<>();
    private CreateComment createComment;
    private List<CommentComponent> commentComponents;


    public NewsItemPage(WebDriver driver) {
        super(driver);
    }
    public Button getBackToNewsButton() {
        return backToNewsButton = new Button(driver, NewsItemPageLocators.BACK_TO_NEWS_BUTTON);
    }

    public TextField getItemCategoryTag() {
        return itemCategoryTag =new TextField(driver,NewsItemPageLocators.ITEM_CATEGORY_TAG);
    }

    public List<CommentComponent> getCommentComponents() {
        commentComponents = new ArrayList<>();
        List<WebElement> comments = driver.findElements(NewsItemPageLocators.COMMENT.getPath());
        for (WebElement comment : comments) {
            commentComponents.add(new CommentComponent(comment));
        }
        return commentComponents;
    }

    public CreateComment getCreateComment() {
        return createComment = new CreateComment(driver.findElement(NewsItemPageLocators.COMMENT_FORM.getPath()));
    }

    public TextField getNewsTitle(){
        return newsTitle = new TextField(driver,NewsItemPageLocators.NEWS_TITLE);
    }

    public TextField getDateInfo() {
        return dateInfo= new TextField(driver,NewsItemPageLocators.DATE_INFO);
    }

    public TextField getAuthorInfo() {
        return authorInfo = new TextField(driver,NewsItemPageLocators.AUTHOR_INFO);
    }

    public Image getImage() {
        return image =new Image(driver,NewsItemPageLocators.IMAGE);
    }

    public TextField getTextContent() {
        return textContent =new TextField(driver,NewsItemPageLocators.TEXT_CONTENT);
    }

    public Link getSourceField() {
        return sourceLink = new Link(driver,NewsItemPageLocators.SOURCE_LINK);
    }

    public List<Link> getSocialNetworkingSitesLink() {
      List<WebElement> socialNetworkingWebElements = driver.findElements(NewsItemPageLocators.SOCIAL_NETWORKING_SITES.getPath());
        for (WebElement element : socialNetworkingWebElements) {
            socialNetworkingSitesLink.add(new Link(element));
        }
        return socialNetworkingSitesLink;
    }
}
