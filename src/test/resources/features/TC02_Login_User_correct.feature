@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc02
  Scenario: TC02 Login User with correct email and password
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible
