package com.greencity.steps;

import com.greencity.pages.NewsItemPage;

public class NewsItemPageBL {
    private NewsItemPage newsItemPage;
    public NewsItemPageBL(){
        newsItemPage = new NewsItemPage();
    }

    public EcoNewsPageBL clickOnBackToNewsButton(){
        newsItemPage.getBackToNewsButton().click();
        return new EcoNewsPageBL();
    }

    public String getItemCategoryName(){
       return newsItemPage.getItemCategoryTag().getTagName();
    }

}
