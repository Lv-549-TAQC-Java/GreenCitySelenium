package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import com.greencity.steps.SocialNetworkingSitePageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialNetworkingTest extends BaseTest{
    @Test
    public void openSocialNetworkingSiteTest() {
        MainPageBL mainPageBL = new MainPageBL(driver);
        SocialNetworkingSitePageBL socialNetworkingSitePageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton()
                .clickOnItemNewsById(0)
                .clickOnSocialNetworkingSitesLink("twitter");
        socialNetworkingSitePageBL.switchWindow();
        socialNetworkingSitePageBL.verifyThatSiteTitleIsCorrect();


    }
}
