@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc03
  Scenario:TC03: Login User with incorrect email and password
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter incorrect email address and password
    And Click login button
    And Verify error Your email or password is incorrect! is visible
    And Close browser