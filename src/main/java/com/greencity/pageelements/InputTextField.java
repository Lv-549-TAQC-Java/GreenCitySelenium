package com.greencity.pageelements;

import org.openqa.selenium.WebDriver;

public class InputTextField extends BaseElement {

    public InputTextField(WebDriver driver, String cssSelector) {
        super(driver, cssSelector);
    }

    public void click() {
        webElement.click();
    }

    public void clear() {
        webElement.clear();
    }

    public void sendText(String text){
        webElement.sendKeys(text);
    }
}
