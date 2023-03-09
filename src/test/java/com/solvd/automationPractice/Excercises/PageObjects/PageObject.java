package com.solvd.automationPractice.Excercises.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    private WebDriver webDriver;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    /*Start Attritubes and methods for KeyPress*/

    @FindBy(linkText = "Key Presses")
    private WebElement keyPressLink;

    @FindBy(xpath = "//input[@id = 'target']")
    private WebElement enterField;

    @FindBy(id = "result")
    private WebElement errorMessageLabel;

    public void clickKeyPress(){
        keyPressLink.click();
    }

    public void enterElement(String text){
        enterField.sendKeys(text);
    }

    public String getErrorMessage() {
        return errorMessageLabel.getText();
    }

    /*Finish Attritubes and methods for KeyPress*/

    /*Start Attritubes and methods for Sliders*/


    @FindBy(linkText = "Horizontal Slider")
    private WebElement sliderLink;

    @FindBy(xpath= "//input [@type = 'range']")
    private WebElement sliderClassName;

    public void clickSliderLink(){
        sliderLink.click();
    }

    public void moveSlider(int x, int y){
        Actions actions = new Actions(webDriver);

        if (x == 0 && y == 0){
            x = -60;
            y = 0;
        }else if(x == 0 && y == 5){
            x = -50;
            y = 0;
        }else if(x == 1 && y == 0){
            x = -30;
            y = 0;
        }else if(x == 1 && y == 5){
            x = -20;
            y = 0;
        }else if(x == 2 && y == 0){
            x = -10;
            y = 0;
        }else if(x == 2 && y == 5){
            x = 5;
            y = 0;
        }else if(x == 3 && y == 0){
            x = 15;
            y = 0;
        }else if(x == 3 && y == 5){
            x = 20;
            y = 0;
        }else if(x == 4 && y == 0){
            x = 30;
            y = 0;
        }else if(x == 4 && y == 5){
            x = 50;
            y = 0;
        }else if(x == 5 && y == 0){
            x = 60;
            y = 0;
        }else{
            x = -60;
        }
        actions.dragAndDropBy(sliderClassName, x, y ).perform();

    }


}