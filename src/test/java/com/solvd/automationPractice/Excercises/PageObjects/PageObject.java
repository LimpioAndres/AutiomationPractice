package com.solvd.automationPractice.Excercises.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void clickLink(){
        keyPressLink.click();
    }

    public void enterElement(String text){
        enterField.sendKeys(text);
    }

    public String getErrorMessage() {
        return errorMessageLabel.getText();
    }

    /*Finish Attritubes and methods for KeyPress*/
}