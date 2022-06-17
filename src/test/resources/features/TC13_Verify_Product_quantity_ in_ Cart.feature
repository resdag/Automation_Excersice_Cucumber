@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc13
  Scenario: TC13 Verify Product quantity in Cart
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click View Product for any product on home page
    And Verify product detail is opened
    And Increase quantity to 4
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity