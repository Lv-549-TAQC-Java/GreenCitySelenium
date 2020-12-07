package com.greencity.ecoNewsTests;


import javafx.scene.shape.Path;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

//    @BeforeSuite
//    public void setup() {
//        DriverRepository.downloadWebDriver();
//    }

    @BeforeClass
    public void setUpClass() {
        String webDriverPath =  System.getenv("ChromWebdriver");
        System.out.println("webdriver" + webDriverPath);
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ita-social-projects.github.io/GreenCityClient");
    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
        driver.quit();

    }

}
