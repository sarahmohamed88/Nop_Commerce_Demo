package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P03_homePage extends PageBase{


        By loginPageButton = By.linkText("Log in");
        By currencyDropdown = By.id("customerCurrency");
        By firstSliderField = By.xpath("//a[@class='nivo-control']");
        By secondSliderField = By.xpath("//a[@class='nivo-control active']");
        By faceBookButton = By.linkText("Facebook");
        By twitterButton= By.linkText("Twitter");
        By rssButton = By.linkText("RSS");
        By youtubeButton = By.linkText("YouTube");
         By wishListField = By.xpath("//button[@title='Add to wishlist']");
         By wishListLabel = By.className("wishlist-label");
         By successMessageLine = By.cssSelector("p.content");
         By backGroundColor = By.cssSelector("div.bar-notification");
         By successMessageBar = By.cssSelector("div.success>p.content");

    public void clickOnLoginButton(){
            clickOnElement(loginPageButton);
        }
        public void selectCurrency(){
            Select currency = new Select(driver.findElement(currencyDropdown));
            currency.selectByVisibleText("Euro");
        }
        public void clickOnFirstSliderInHomePage(){
            clickOnElement(firstSliderField);
        }
        public void clickOnSecondSliderInHomePage(){
            clickOnElement(secondSliderField);
        }
        public void findFollowUsLinks(){
           boolean social = driver.findElement(By.className("social")).isDisplayed();
            System.out.println(social);
        }
        public void clickOnFaceBookButton(){
            clickOnElement(faceBookButton);
        }
        public void clickOnTwitterButton(){
            clickOnElement(twitterButton);
        }
        public void clickOnRssButton(){
            clickOnElement(rssButton);
        }
        public void clickOnYoutubeButton(){
            clickOnElement(youtubeButton);
        }

        public void clickOnWishListOnProductYouLiked(){
            driver.findElements(wishListField).get(2).click();

        }
        public void checkSuccessMessageBarIsDisplayed(){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageBar));
            driver.findElement(successMessageBar).click();

        }
        public void checkOnSuccessMessageAndBackGroundColor(){
            String successMessage = driver.findElement(successMessageLine).getText();
            System.out.println(successMessage);

            String color = driver.findElement(backGroundColor).getCssValue("background-color");
            System.out.println(color);
        }
        public void clickOnWishListTab(){
            clickOnElement(wishListLabel);
        }
        public void checkQytValueIsBiggerThanZero(){
            String qty = driver.findElement(By.cssSelector("input.qty-input")).getAttribute("value");
            int value = Integer.parseInt(qty);
            if(value>0){
                System.out.println("the qty is bigger than zero");
            }
            else {
                System.out.println("The wishlist is empty");
            }

        }
        public P03_homePage(WebDriver driver) {
            super(driver);
        }
    }

