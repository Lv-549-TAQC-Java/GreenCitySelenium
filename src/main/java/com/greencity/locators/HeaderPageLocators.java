package com.greencity.locators;

import org.openqa.selenium.By;

public enum HeaderPageLocators implements BaseLocator{

    ECO_NEWS_BUTTON(By.cssSelector(".navigation-menu-left [href='\\/GreenCityClient\\/news']"));


    private By path;

    HeaderPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
