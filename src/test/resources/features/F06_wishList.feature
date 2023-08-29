Feature: F06_wish list | user choose wish list product

  @addToWishList
  Scenario: user choose wish list product
    Given user clicks on wish list button on the product he liked it
    When the product has been added to his wish list and success message is displayed

    @wishListTab
    Scenario: user check the wish list items
      Given user clicks on wish list tab
      Then user should get Qty value and verify it's bigger than zero