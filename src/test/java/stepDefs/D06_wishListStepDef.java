package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D06_wishListStepDef extends TestBase {
    P03_homePage homePageObject = new P03_homePage(driver);

    @Given("user clicks on wish list button on the product he liked it")
    public void user_clicks_on_wish_list_button_on_the_product_he_liked_it() {
        homePageObject.clickOnWishListOnProductYouLiked();
       homePageObject.checkSuccessMessageBarIsDisplayed();
    }

    @When("the product has been added to his wish list and success message is displayed")
    public void the_product_has_been_added_to_his_wish_list_and_success_message_is_displayed() {
     String successMessage = driver.findElement(By.cssSelector("p.content")).getText();
        homePageObject.checkOnSuccessMessageAndBackGroundColor();
        Assert.assertTrue(successMessage.contains("The product has been added"));
    }

    @Given("user clicks on wish list tab")
    public void userClicksOnWishListTab() {
        homePageObject.clickOnWishListOnProductYouLiked();
        homePageObject.clickOnWishListTab();
    }

    @Then("user should get Qty value and verify it's bigger than zero")
    public void userShouldGetQtyValueAndVerifyItSBiggerThanZero() {
     homePageObject.checkQytValueIsBiggerThanZero();

    }
}