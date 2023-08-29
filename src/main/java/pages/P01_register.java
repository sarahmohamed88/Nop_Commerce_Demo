package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register extends PageBase{
    public P01_register(WebDriver driver) {
        super(driver);
    }
    By registerPageButton = By.xpath("//a[@class='ico-register']");
    By femaleField = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By birthDayDropdown = By.name("DateOfBirthDay");
    By birthMonthDropdown = By.name("DateOfBirthMonth");
    By birthYearDropdown = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    public void clickOnRegisterPageButton(){
        clickOnElement(registerPageButton);
    }

    public void clickOnFemaleField(){
        clickOnElement(femaleField);
    }
    public void enterFirstName(){
        setElementText(firstNameField,"automation");
    }
    public void enterLastName(){
        setElementText(lastNameField,"tester");
    }
    public void selectBirthDay(){
        Select day = new Select(driver.findElement(birthDayDropdown));
        day.selectByValue("5");
    }
public void selectBirthMonth(){
        Select month = new Select(driver.findElement(birthMonthDropdown));
        month.selectByValue("9");
}
public void selectBirthYear(){
        Select year = new Select(driver.findElement(birthYearDropdown));
        year.selectByValue("1999");
}
public void enterEmail(){
        setElementText(emailField,"test1@example.com");
}
public void enterPassword(){
        setElementText(passwordField,"P@ssw0rd");
}
public void enterConfirmPassword(){
        setElementText(confirmPasswordField,"P@ssw0rd");
}
public void clickOnRegisterButton(){
        clickOnElement(registerButton);
}





}
