package com.greencity.steps;



import org.openqa.selenium.WebDriver;

public class CreateNewsPageBL {
    protected WebDriver driver;

    public CreateNewsPageBL(WebDriver driver){
        this.driver = driver;

    }

    public CreateNewsPageBL clickOnTagCreateButton(){

        return new CreateNewsPageBL(driver);
    }

}
