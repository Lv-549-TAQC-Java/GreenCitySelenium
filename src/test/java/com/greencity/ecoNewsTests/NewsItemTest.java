package com.greencity.ecoNewsTests;

import com.greencity.ecoNewsTests.BaseTest;
import com.greencity.navigation.Navigation;
import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.greencity.enums.URLs.BASE_URL;

public class NewsItemTest extends BaseTest {
    @Test
    public void simpleTest(){

        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        EcoNewsPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton();
    }

}

