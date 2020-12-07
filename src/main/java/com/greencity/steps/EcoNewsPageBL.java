package com.greencity.steps;

import com.greencity.pages.CreateNewsPage;
import com.greencity.pages.EcoNewsPage;
import org.openqa.selenium.WebDriver;

public class EcoNewsPageBL {
    protected WebDriver driver;
    private EcoNewsPage ecoNewsPage;
    private CreateNewsPage createNewsPage;

    public EcoNewsPageBL(WebDriver driver){
        this.driver = driver;
        ecoNewsPage = new EcoNewsPage(driver);
    }
    public EcoNewsPageBL clickOnTagButton(){
        ecoNewsPage.getTagButtons().get(0).click();
        ecoNewsPage.getTagButtons().get(1).click();
        ecoNewsPage.getTagButtons().get(2).click();
        return new EcoNewsPageBL(driver);
    }

    public EcoNewsPageBL clickOnEcoNewsButton(){
        createNewsPage.getCreateNews().click();
        return new EcoNewsPageBL(driver);
    }



}
