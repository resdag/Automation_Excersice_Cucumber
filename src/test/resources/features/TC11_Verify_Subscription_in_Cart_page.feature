@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc11
  Scenario: TC11 Verify Subscription in Cart page
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible