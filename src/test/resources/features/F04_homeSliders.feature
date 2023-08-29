Feature: F04_homeSliders | user clicks on sliders in home page
  @nokiaSlider
  Scenario: Nokia Lumia 1020 slider is clickable on home page
    Given user clicks on first slider
    And user go to first slider page
  @iphoneSlider
    Scenario: iPhone slider is clickable on home page
      Given user clicks on second slider
      And user go to second slider page