package stepDefs;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_register;
import pages.P03_homePage;

public class D01_registerStepDef extends TestBase {
    //P03_homePage homePageObject = new P03_homePage(driver);
    P01_register registerObject = new P01_register(driver);
    @Given("user go to register page")
    public void user_go_to_register_page() {
        registerObject.clickOnRegisterPageButton();
    }

    @Given("user select gender type")
    public void user_select_gender_type() {
registerObject.clickOnFemaleField();
    }
    @Given("user enter first name")
    public void user_enter_first_name() {
registerObject.enterFirstName();
    }
    @Given("user enter last name")
    public void user_enter_last_name() {
registerObject.enterLastName();
    }
    @Given("user enter date of birth")
    public void user_enter_date_of_birth() {
    registerObject.selectBirthDay();
    registerObject.selectBirthMonth();
    registerObject.selectBirthYear();
    }
    @Given("user enter email")
    public void user_enter_email() {
registerObject.enterEmail();
    }
    @When("user enter password")
    public void user_enter_password() {
    registerObject.enterPassword();
    }
    @And("user confirm password")
    public void userConfirmPassword() {
    registerObject.enterConfirmPassword();
    }
    @Then("user click on Register button")
    public void user_click_on_register_button() {
registerObject.clickOnRegisterButton();
    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        String successMessage = driver.findElement(By.cssSelector("div.page-body>div.result")).getText();
         Assert.assertEquals(successMessage,"Your registration completed");
    }

    }
