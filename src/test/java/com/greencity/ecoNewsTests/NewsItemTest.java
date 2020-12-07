package com.greencity.ecoNewsTests;

import com.greencity.ecoNewsTests.BaseTest;
import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.greencity.steps.MainPageBL;

import java.util.concurrent.TimeUnit;




public class NewsItemTest extends BaseTest{
    @Test
    public void simpleTest(){

        MainPageBL mainPageBL = new MainPageBL(driver);

       EcoNewsPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnEcoNewsButton();


    }

}

