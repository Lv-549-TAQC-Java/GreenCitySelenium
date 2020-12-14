package com.greencity.steps;

import com.greencity.pageelements.Button;
import com.greencity.pageelements.Link;
import com.greencity.pages.NewsItemPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class NewsItemPageBL {
    private NewsItemPage newsItemPage;
    protected WebDriver driver;

    public NewsItemPageBL(WebDriver driver) {
        this.driver = driver;
        newsItemPage = new NewsItemPage(driver);
    }

    public EcoNewsPageBL clickOnBackToNewsButton() {
        newsItemPage.getBackToNewsButton().click();
        return new EcoNewsPageBL(driver);
    }

    public String getItemCategoryName() {
        return newsItemPage.getItemCategoryTag().getText();
    }

    public SocialNetworkingSitePageBL clickOnSocialNetworkingSitesLink(String siteName) {
        List<Link> socialNetworkingSitesList = newsItemPage.getSocialNetworkingSitesLink();
        for (Link sites : socialNetworkingSitesList)
            if (sites.getAttributeName().equals(siteName)) {
                sites.click();
            }
        return new SocialNetworkingSitePageBL(driver);
    }


}
