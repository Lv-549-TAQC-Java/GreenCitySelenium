package com.greencity.pageelements;

import org.openqa.selenium.WebDriver;

public class Button extends BaseElement{

    public Button(WebDriver driver, String cssSelector) {
        super(driver, cssSelector);
    }

    public void click(){
        this.webElement.click();
    }

    public Button isDisplayed(){
        this.webElement.isDisplayed();
        return this;
    }
}
