package com.solvd.automationPractice.Excercises;

import com.solvd.automationPractice.Excercises.PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTest {

/*
    @Test
    public void myTestExample(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com/login");
        webDriver.findElement(By.id("username")).sendKeys("tomsmith");
        webDriver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        webDriver.findElement(By.xpath("//button[@type='submit']")).click();
    }

*/
    private WebDriver webDriver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com/login");
    }

    @Test
    public void myTestExample2(){
        LoginPage pageObjects = new LoginPage(webDriver);
        pageObjects.typeUserName("tomsmith");
        pageObjects.typePassword("SuperSecretPassword!");
        pageObjects.clickSubmitButton();
    }


}
