package com.greencity.locators;

import org.openqa.selenium.By;

public enum RegisterPageLocators implements BaseLocator {

    EMAIL(By.id("email")),
    FIRST_NAME(By.id("firstName")),
    PASSWORD(By.id("password")),
    CONFIRM_PASSWORD(By.id("repeatPassword")),
    SUBMIT_BUTTON(By.xpath(".//*[@type='submit']"));

    private By path;

    RegisterPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
