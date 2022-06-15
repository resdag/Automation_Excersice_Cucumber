@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc07
  Scenario: TC07 Verify Test Cases Page
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Test Cases button
    And Verify user is navigated to test cases page successfully
