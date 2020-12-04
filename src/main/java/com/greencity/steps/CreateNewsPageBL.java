package com.greencity.steps;

import com.greencity.pages.CreateNewsPage;
import org.openqa.selenium.WebDriver;

public class CreateNewsPageBL {
    protected WebDriver driver;
    private CreateNewsPage createNewsPage;
    public CreateNewsPageBL(WebDriver driver){
        this.driver = driver;
        createNewsPage = new CreateNewsPage(driver);
    }
}
