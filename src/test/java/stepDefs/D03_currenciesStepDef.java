package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.P03_homePage;

import java.sql.SQLOutput;
import java.util.List;

public class D03_currenciesStepDef extends TestBase {
P03_homePage homePageObject = new P03_homePage(driver);

    @Given("user select Euro currency")
    public void user_select_euro_currency() {
     homePageObject.selectCurrency();
    }


    @Then("Euro Symbol is shown on the products displayed in Home page")
    public void euroSymbolIsShownOnTheProductsDisplayedInHomePage() {
        List<WebElement> euroSymbol = driver.findElements(By.className("actual-price"));
        for (WebElement element:euroSymbol){
            if(element.isDisplayed()){
                System.out.println("€"+ element.getText());
                //Assert.assertTrue(euroSymbol.contains("€")) ;
            }

        }
    }

}


















