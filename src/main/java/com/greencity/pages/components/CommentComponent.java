package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommentComponent {

    WebElement authorName;
    WebElement commentDate;
    WebElement commentText;
    private final WebElement container;

    public CommentComponent(WebElement container){
        this.container = container;
        init();
    }

    public WebElement getAuthorName(){return authorName;}
    public WebElement getCommentDate(){return commentDate;}
    public WebElement getCommentText(){return commentText;}

    private void init(){
        authorName = container.findElement(By.cssSelector("app-comments-list .ng-star-inserted:nth-of-type(1) " +
                ".author-name span"));
        commentDate = container.findElement(By.cssSelector("app-comments-list .ng-star-inserted:nth-of-type(1)" +
                ".comment-date-month"));
        commentText = container.findElement(By.cssSelector("app-comments-list .ng-star-inserted:nth-of-type(1) .comment-text"));
    }
    public void click(){
        container.click();
    }

}
