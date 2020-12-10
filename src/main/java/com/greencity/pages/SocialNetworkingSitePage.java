package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialNetworkingSitePage extends BasePage{

    public SocialNetworkingSitePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return this.driver.getTitle();
    }

}
