@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc05
  Scenario: TC05 Register User with existing email
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist! is visible
    And Close browser
