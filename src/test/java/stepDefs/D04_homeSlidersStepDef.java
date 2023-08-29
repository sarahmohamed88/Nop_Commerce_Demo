package stepDefs;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.P03_homePage;

public class D04_homeSlidersStepDef extends TestBase {
P03_homePage homePageObject = new P03_homePage(driver);
    @Given("user clicks on first slider")
    public void userClicksOnFirstSlider() {
        homePageObject.clickOnFirstSliderInHomePage();
    }

    @And("user go to first slider page")
    public void userGoToFirstSliderPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @Given("user clicks on second slider")
    public void userClicksOnSecondSlider() {
        homePageObject.clickOnSecondSliderInHomePage();
    }


    @And("user go to second slider page")
    public void userGoToSecondSliderPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
