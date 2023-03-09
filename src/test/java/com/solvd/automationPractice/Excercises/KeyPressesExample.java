package com.solvd.automationPractice.Excercises;

import com.solvd.automationPractice.Excercises.PageObjects.PageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPressesExample {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @Test
    public void KeyPressesTest(){
        PageObject pageObject = new PageObject(driver);
        pageObject.clickKeyPress();
        pageObject.enterElement("Andres" + Keys.BACK_SPACE);
        Assert.assertTrue(pageObject.getErrorMessage().contains("You entered: BACK_SPACE"));
    }
}
