@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc08
  Scenario: TC08 Verify All Products and product detail page
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand