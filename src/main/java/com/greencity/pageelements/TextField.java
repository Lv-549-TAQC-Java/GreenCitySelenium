package com.greencity.pageelements;

import org.openqa.selenium.WebDriver;

public class TextField extends BaseElement{

    public TextField(WebDriver driver, String cssSelector) {
        super(driver, cssSelector);
    }

    public String getText(){
        return webElement.getText();
    }


}
