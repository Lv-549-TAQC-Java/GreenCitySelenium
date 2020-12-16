package com.greencity.locators;

import org.openqa.selenium.By;

public enum HeaderPageLocators implements BaseLocator{

    ECO_NEWS_BUTTON(By.cssSelector(".navigation-menu-left [href='\\/GreenCityClient\\/news']")),
    SIGN_IN(By.cssSelector(".tertiary-global-button .ng-star-inserted")),
    SIGN_UP(By.cssSelector("* li.sign-up-link.ng-star-inserted > div"));

    private By path;

    HeaderPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
