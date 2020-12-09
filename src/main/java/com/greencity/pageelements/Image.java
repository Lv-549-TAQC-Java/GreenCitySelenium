package com.greencity.pageelements;

import org.openqa.selenium.WebDriver;

public class Image extends BaseElement {

    public Image(WebDriver driver, String cssSelector) {
        super(driver, cssSelector);
    }

    public void click(){
        webElement.click();
    }
    public String getImageSource(){
        return webElement.getAttribute("src");
    }
}
