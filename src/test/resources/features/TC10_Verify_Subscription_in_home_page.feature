@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc10
  Scenario: TC10 Verify Subscription in home page
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible