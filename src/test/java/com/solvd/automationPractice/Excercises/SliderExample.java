package com.solvd.automationPractice.Excercises;

import com.solvd.automationPractice.Excercises.PageObjects.PageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderExample {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void SliderTest(){
        PageObject pageObject = new PageObject(driver);
        pageObject.clickSliderLink();
        pageObject.moveSlider(4, 0); // X: is the integer number, Y: is the decimal number
    }
}
