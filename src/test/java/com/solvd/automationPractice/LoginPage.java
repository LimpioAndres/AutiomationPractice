package com.solvd.automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    /*Start Attritubes and methods for login page*/
    @FindBy(id = "username")
    private WebElement userfield;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    //Enter the username into the user field
    public void typeUserName(String user){
        userfield.clear();
        userfield.sendKeys(user);
    }

    //Enter the password into the password field
    public void typePassword(String pass){
        passwordField.clear();
        passwordField.sendKeys(pass);
    }

    public void clickSubmitButton(){
        loginButton.click();
    }

    /*Finish attritubes and methods for login page*/

    //---------------------------------------------------------

    /*Start attritubes to click on a list*/
    @FindBy(linkText = "A/B Testing")
    private WebElement abTesting;

    @FindBy(linkText = "Dropdown")
    private WebElement dropdownTesting;

    @FindBy(linkText = "Forgot Password")
    private WebElement forgotPassTesting;


    public void clickButtom(){
        abTesting.click();
    }

    /*Finish attritubes to click on a list*/

    /*Start attritubes and methods for click on a dropdown list*/

    @FindBy(id = "dropdown")
    private By dropdownList;

    public void clickDropButtom(){
        dropdownTesting.click();
    }

    private Select findDropDownElement(){
        return new Select(webDriver.findElement(dropdownList));
    }

    public void selectDropDownElement(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    /*Finish attritubes and methods for click on a dropdown list*/

    /*Start attritubes and methods for click on a forgot password*/

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement retrievePassword;

    public void clickForgotButtom(){
        forgotPassTesting.click();
    }

    public void typeEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickRetrieveButtom(){
        retrievePassword.click();
    }

    /*Finish attritubes and methods for click on a forgot password*/


}
