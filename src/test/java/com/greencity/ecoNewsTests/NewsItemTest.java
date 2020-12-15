package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewsItemTest extends BaseTest {
    @Test
    public void showListOfTheEcoNewsItems() {
        MainPageBL mainPageBL = new MainPageBL(driver);

        EcoNewsPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton();
        ecoNewsPageBL.verifySearchOfTheList();
    }

    @Test
    public void verifyThatItemNewsCategoryNameIsCorrect(){
        MainPageBL mainPageBL = new MainPageBL(driver);
        NewsItemPageBL newsItemPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton()
                .clickOnItemNewsById(0);
        String actualItemCategoryName = newsItemPageBL. getItemCategoryName();
        String correctItemCategoryName = "Education";
        Assert.assertEquals(actualItemCategoryName,correctItemCategoryName);
    }
}

