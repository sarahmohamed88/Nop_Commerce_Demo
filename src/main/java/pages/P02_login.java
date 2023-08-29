package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase{
    public P02_login(WebDriver driver) {
        super(driver);
    }



    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[@class='button-1 login-button']");

    public void enterValidEmail(String validEmail){
        setElementText(emailField,validEmail);
    }
public void enterValidPassword(String validPassword){
        setElementText(passwordField,validPassword);
}
public void clickOnLoginButton(){
        clickOnElement(loginButton);
}

public void enterInvalidEmail(String invalidEmail){
        setElementText(emailField,invalidEmail);
}
public void enterInvalidPassword(String invalidPassword){
        setElementText(passwordField,invalidPassword);
}
}
