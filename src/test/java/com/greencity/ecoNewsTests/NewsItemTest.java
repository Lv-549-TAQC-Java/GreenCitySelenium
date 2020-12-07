package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import org.testng.annotations.Test;

public class NewsItemTest extends BaseTest {
    @Test
    public void simpleTest(){

        MainPageBL mainPageBL = new MainPageBL(driver);

       EcoNewsPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton();

//        System.out.println(new MainPageBL(driver)
//                .getHeaderPageBL()
//                .clickOnEcoNewsButton()
//                .numbOfNewsItemOnThePage());


    }

}

