package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
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
        newsItemPageBL.verifyItemCategoryName();
    }

    @Test
    public void verifyThatDateIsCorrect(){
        MainPageBL mainPageBL = new MainPageBL(driver);
        NewsItemPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton()
                .clickOnItemNewsById(0);
        ecoNewsPageBL.verifyItemDate();
    }
}

