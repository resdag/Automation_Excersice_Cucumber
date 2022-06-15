@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc09
  Scenario: TC09 Search Product
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible