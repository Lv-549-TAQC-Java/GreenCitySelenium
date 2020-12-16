package com.greencity.steps;



import com.greencity.enums.FiltersTeg;
import com.greencity.pageelements.Button;
import com.greencity.pages.CreateNewsPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CreateNewsPageBL {
    protected WebDriver driver;
    private CreateNewsPage createNewsPage;

    public CreateNewsPageBL(WebDriver driver){
        this.driver = driver;
        createNewsPage = new CreateNewsPage(driver);

    }

    public CreateNewsPageBL clickOnTagCreateButton(FiltersTeg tags) {
        List<Button> tagsList = createNewsPage.getTagsList();
        for (Button tag : tagsList)
            if (tag.getText().equals(tags.getFilterTeg())) {
                tag.click();
            }
        return new CreateNewsPageBL(driver);
    }

    public CreateNewsPageBL clickOnTagCreateButton(){

        return new CreateNewsPageBL(driver);
    }

}
