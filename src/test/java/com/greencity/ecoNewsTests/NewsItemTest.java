package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import org.testng.annotations.Test;


public class NewsItemTest extends BaseTest{
    @Test
    public void simpleTest(){
        MainPageBL mainPageBL = new MainPageBL(driver);
        NewsItemPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton()
                .clickOnItemNewsCard();
        ecoNewsPageBL.verifyItemCategoryName();
    }

}

