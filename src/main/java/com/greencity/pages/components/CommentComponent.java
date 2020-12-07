package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommentComponent {
    WebElement imgAvatar;
    WebElement authorName;
    WebElement commentDate;
    WebElement commentText;
    WebElement editButton;
    WebElement deleteButton;
    WebElement replyButton;
    WebElement likeButton;
    WebElement commentLike;
    List<CommentComponent> replies;


    public CommentComponent(WebElement container){
        init(container);
    }
    public WebElement getImdAvatar(){return imgAvatar;}
    public WebElement getAuthorName(){return authorName;}
    public WebElement getCommentDate(){return commentDate;}
    public WebElement getCommentText(){return commentText;}

    private void init(WebElement container){
        imgAvatar = container.findElement(By.cssSelector("div.comment-avatar"));
        authorName = container.findElement(By.cssSelector("div.comment-details > div.author-name"));
        commentDate = container.findElement(By.cssSelector("div.comment-details > div.comment-date-likes > " +
                "div.comment-date"));
        commentText = container.findElement(By.cssSelector("div.comment-main-text > p"));
    }

}
