package com.greencity.steps;

import org.openqa.selenium.WebDriver;

public class MainPageBL {
    protected WebDriver driver;

    public MainPageBL(WebDriver driver) {
        this.driver = driver;
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL(driver);
    }
}
