package com.greencity.steps;

import com.greencity.pages.SocialNetworkingSitePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SocialNetworkingSitePageBL {
    private SocialNetworkingSitePage socialNetworkingSitePage;
    protected WebDriver driver;

    public SocialNetworkingSitePageBL(WebDriver driver){
        this.driver = driver;
        socialNetworkingSitePage = new SocialNetworkingSitePage(driver);
    }

    public  void switchWindow(){
        String currentWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if(!handle.equalsIgnoreCase(currentWindow)){
                driver.switchTo().window(handle);
                break;
            }
        }
    }


    public void verifyThatSiteTitleIsCorrect(){
        String expectedResult = "Твиттер";
        String actualResult = socialNetworkingSitePage.getTitle();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
