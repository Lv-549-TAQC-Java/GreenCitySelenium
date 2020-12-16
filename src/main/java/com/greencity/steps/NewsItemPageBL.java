package com.greencity.steps;

import com.greencity.pageelements.Button;
import com.greencity.pageelements.Link;
import com.greencity.pages.NewsItemPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class NewsItemPageBL {
    protected WebDriver driver;
    private NewsItemPage newsItemPage;

    public NewsItemPageBL(WebDriver driver) {
        this.driver = driver;
        newsItemPage = new NewsItemPage(driver);
    }

    public EcoNewsPageBL clickOnBackToNewsButton() {
        newsItemPage.getBackToNewsButton().click();
        return new EcoNewsPageBL(driver);
    }
    public NewsItemPageBL putComment(){
        newsItemPage.getCreateComment().getCommentText().sendKeys("hello");
        return new NewsItemPageBL(driver);
    }
    public NewsItemPageBL clickOnCommentButton(){
        newsItemPage.getCreateComment().getCommentButton().click();
        return new NewsItemPageBL(driver);
    }

    public String getItemCategoryName() {
        return newsItemPage.getItemCategoryTag().getText();
    }

    public String getItemAuthorName() {
        return newsItemPage.getAuthorInfo().getText();
    }

    public SocialNetworkingSitePageBL clickOnSocialNetworkingSitesLink(String siteName) {
        List<Link> socialNetworkingSitesList = newsItemPage.getSocialNetworkingSitesLink();
        for (Link sites : socialNetworkingSitesList)
            if (sites.getAttributeName().equals(siteName)) {
                sites.click();
            }
        return new SocialNetworkingSitePageBL(driver);
    }

    public String getCreatedDate(){
        return newsItemPage.getDateInfo().getText();
    }

}
