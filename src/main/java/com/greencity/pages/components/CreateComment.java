package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateComment {
    WebElement commentText;
    WebElement commentButton;
    private final WebElement container;

    public CreateComment(WebElement container) {
        this.container = container;
        init();
    }

    public WebElement getCommentText(){return commentText;}
    public WebElement getCommentButton(){return commentButton;}

    public void init(){
        commentText = container.findElement(By.cssSelector("textarea"));
        commentButton = container.findElement(By.cssSelector(".primary-global-button"));
    }
}
