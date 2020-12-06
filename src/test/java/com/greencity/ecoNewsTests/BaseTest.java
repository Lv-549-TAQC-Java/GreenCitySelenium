package com.greencity.ecoNewsTests;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public void setUpClass() {
        String webDriverPath =  System.getenv("ChromWebDriver");
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
