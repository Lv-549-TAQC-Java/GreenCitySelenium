package com.greencity.steps;

import com.greencity.enums.FiltersTeg;
import com.greencity.pageelements.Button;
import com.greencity.pages.CreateNewsPage;
import org.openqa.selenium.WebDriver;

public class CreateNewsPageBL {
    protected WebDriver driver;
    private CreateNewsPage createNewsPage;

    public CreateNewsPageBL(WebDriver driver) {
        this.driver = driver;
        createNewsPage = new CreateNewsPage(driver);

    }

    public CreateNewsPageBL clickOnTagCreateButton(FiltersTeg tags) {
        createNewsPage.getTagByName(tags).click();
        return new CreateNewsPageBL(driver);
    }

    public boolean isTagActive(FiltersTeg tag) {
        Button element = createNewsPage.getTagByName(tag);
       return element
                .getAttribute("class")
                .matches(".*(filters-color).*");
    }
}