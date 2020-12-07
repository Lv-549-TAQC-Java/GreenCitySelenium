package com.greencity.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateComment {
    WebElement imgAvatar;
    WebElement commentText;
    WebElement commentButton;

    public void init(WebElement container){
        imgAvatar = container.findElement(By.className("profile-avatar comments default-avatar ng-star-inserted"));
        commentButton = container.findElement(By.className("primary-global-button"));
        commentText = container.findElement(By.className("ng-touched ng-dirty ng-valid"));
    }
}
