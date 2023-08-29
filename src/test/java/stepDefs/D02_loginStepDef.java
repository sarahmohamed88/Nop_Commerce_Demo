package stepDefs;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P02_login;
import pages.P03_homePage;

public class D02_loginStepDef extends TestBase {

    P03_homePage homePageObject = new P03_homePage(driver);
    P02_login loginObject = new P02_login(driver);
    @Given("user redirect to login page")
    public void user_redirect_to_login_page() {

        homePageObject.clickOnLoginButton();

    }
    @And("user login with valid data {string}  {string}")
    public void userLoginWithValidData(String validEmail, String validPassword) {

        loginObject.enterValidEmail(validEmail);
        loginObject.enterValidPassword(validPassword);
    }
    @Given("user click on login button")
    public void user_click_on_login_button() {
        loginObject.clickOnLoginButton();

    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        boolean myAccount = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
        System.out.println(myAccount);

    }


    @And("user login with invalid data {string}  {string}")
    public void userLoginWithInvalidData(String invalidEmail, String invalidPassword) {
        loginObject.enterInvalidEmail(invalidEmail);
        loginObject.enterInvalidPassword(invalidPassword);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String errorMessage = driver.findElement(By.className("message-error")).getText();
        Assert.assertEquals(errorMessage,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }

}
