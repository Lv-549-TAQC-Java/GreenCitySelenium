package com.greencity.pages.components;

import com.greencity.locators.CreateCommentLocators;
import com.greencity.pageelements.Button;
import com.greencity.pageelements.InputTextField;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class CreateComment {
    private InputTextField commentText;
    private Button commentButton;
    private final WebElement container;

    public CreateComment(WebElement container) {
        this.container = container;
        init();
    }

    public void init() {
        commentText = new InputTextField(container, CreateCommentLocators.COMMENT_TEXT);
        commentButton = new Button(container, CreateCommentLocators.COMMENT_BUTTON);
    }
}
