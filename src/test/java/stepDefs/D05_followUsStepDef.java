package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.P03_homePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class D05_followUsStepDef extends TestBase {
    P03_homePage homePageObject = new P03_homePage(driver);
    @Given("find follow us link")
    public void findFollowUsLinks(){
    homePageObject.findFollowUsLinks();
}

    @Given("user click on facebook button")
    public void user_click_on_facebook_button() {
        homePageObject.clickOnFaceBookButton();
    }

    @Then("{string} facebook link is opened in new tab")
    public void facebookLinkIsOpenedInNewTab(String facebookLink) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(0));
       // driver.close();

        Assert.assertEquals(facebookLink,"https://www.facebook.com/nopCommerce");

    }


    @Given("user click on twitter button")
    public void userClickOnTwitterButton() {
        homePageObject.clickOnTwitterButton();
    }
    @Then("{string} twitter link is opened in new tab")
    public void twitterLinkIsOpenedInNewTab(String twitterLink) {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));
        //driver.close();
        Assert.assertEquals(twitterLink,"https://twitter.com/nopCommerce");
    }

    @Given("user click on rss button")
    public void userClickOnRssButton() {
        homePageObject.clickOnRssButton();

    }
    @Then("{string} rss link is opened in new tab")
    public void rssLinkIsOpenedInNewTab(String rssLink) {

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));
        Assert.assertEquals(rssLink,"https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @Given("user click on youtube button")
    public void userClickOnYoutubeButton() {
        homePageObject.clickOnYoutubeButton();
    }


    @Then("{string} youtube link is opened in new tab")
    public void youtubeLinkIsOpenedInNewTab(String youtubeLink) {

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));

        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));

    Assert.assertEquals(youtubeLink,"https://www.youtube.com/user/nopCommerce");
}
}
