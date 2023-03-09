package com.solvd.automationPractice.Excercises.HoverPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversPageExample {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
    }

    @Test
    public void hoversPage(){

        HomePage homePage = new HomePage(driver);
        HomePage.FigureCaption caption = homePage.hoverOverFigure(2);
        Assert.assertTrue(caption.getLink().endsWith("/users/2"), "Link incorrect");
        WebElement clickP = driver.findElement(By.partialLinkText("View profile"));
        clickP.click();

        //Others asserts
        /*Assert.assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user2", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");*/
    }
}
