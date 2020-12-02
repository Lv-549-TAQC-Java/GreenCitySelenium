package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SuccessRegisterPage extends BasePage{
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle = driver
                .findElement(By.xpath(".//*contains[text(),'You have succesfully'"));
    }
}
