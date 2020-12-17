package com.greencity.pages.components;

import com.greencity.locators.CommentComponentLocators;
import com.greencity.pageelements.TextField;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
@EqualsAndHashCode(exclude = "container")
public class CommentComponent {
    private TextField authorName;
    private TextField commentDate;
    private TextField commentText;
    private final WebElement container;

    public CommentComponent(WebElement container) {
        this.container = container;
        init();
    }

    private void init() {
        authorName = new TextField(container, CommentComponentLocators.AUTHOR_NAME);
        commentDate = new TextField(container, CommentComponentLocators.COMMENT_DATE);
        commentText = new TextField(container, CommentComponentLocators.COMMENT_TEXT);
    }

    public void click() {
        container.click();
    }

    @Override
    public String toString() {
        return "CommentComponent{" +
                "authorName=" + authorName.getText() +
                ", commentDate=" + commentDate.getText() +
                ", commentText=" + commentText.getText() +
                '}';
    }
}
