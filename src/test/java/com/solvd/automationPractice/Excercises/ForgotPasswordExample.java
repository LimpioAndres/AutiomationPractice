package com.solvd.automationPractice.Excercises;

import com.solvd.automationPractice.Excercises.PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordExample {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @Test
    public void forgotP(){
        LoginPage pageObjects = new LoginPage(driver);
        pageObjects.clickForgotButtom();
        pageObjects.typeEmail("alimpio.laba@solvd.com");
        pageObjects.clickRetrieveButtom();
    }
}
