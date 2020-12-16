package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import org.testng.annotations.Test;

public class BackToNewsPageTest extends BaseTest {

    @Test
    public void check() {
        MainPageBL mainPageBL = new MainPageBL(driver);
        EcoNewsPageBL newsItemPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton()
                .clickOnItemNewsById(0)
                .clickOnBackToNewsButton();

    }

}
