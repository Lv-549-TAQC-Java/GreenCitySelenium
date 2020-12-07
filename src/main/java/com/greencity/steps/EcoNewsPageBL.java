package com.greencity.steps;

import com.greencity.pages.EcoNewsPage;
import org.openqa.selenium.WebDriver;

public class EcoNewsPageBL {
    protected WebDriver driver;
    private EcoNewsPage ecoNewsPage;

    public EcoNewsPageBL(WebDriver driver){
        this.driver = driver;
        ecoNewsPage = new EcoNewsPage(driver);
    }

    public int numbOfNewsItemOnThePage() {
        return ecoNewsPage.getNewsItemComponentList().getNumbOfNewsItemOnThePage();
    }
    public NewsItemPageBL clickOnItemNewsCard(){
        ecoNewsPage.getItemNewsCard().click();
        return new NewsItemPageBL(driver);
    }
}
