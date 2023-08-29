Feature: F05_followUs | users could open followUs links
  @facebookLink
  Scenario: user opens facebook link
    Given user click on facebook button
    Then  "https://www.facebook.com/nopCommerce" facebook link is opened in new tab
@twitterLink
    Scenario: user opens twitter link
      Given user click on twitter button
      Then "https://twitter.com/nopCommerce" twitter link is opened in new tab
@rssLink
  Scenario: user opens rss link
      Given user click on rss button
    Then  "https://demo.nopcommerce.com/new-online-store-is-open" rss link is opened in new tab
@youtubeLink
  Scenario: user opens youtube link
          Given user click on youtube button
    Then "https://www.youtube.com/user/nopCommerce" youtube link is opened in new tab
