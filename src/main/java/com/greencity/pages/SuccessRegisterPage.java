package com.greencity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessRegisterPage extends BasePage {
    @FindBy(xpath = ".//*contains[text(),'You have succesfully'")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}
