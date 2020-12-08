package com.greencity.steps;


import com.greencity.pages.components.Tags;
import org.openqa.selenium.WebDriver;

public class CreateNewsPageBL {
    protected WebDriver driver;
    private final Tags tags;
    public CreateNewsPageBL(WebDriver driver){
        this.driver = driver;
        tags = Tags.getInstance(driver);
    }


    public CreateNewsPageBL clickOnTagCreateButton(){
        tags.getNewsTag().click();
        return new CreateNewsPageBL(driver);
    }

}
