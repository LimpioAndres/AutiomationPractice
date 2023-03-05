package com.solvd.automationPractice.Excercises;

import com.solvd.automationPractice.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ABexample {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @Test
    public void inputExample(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtom();
    }

}
