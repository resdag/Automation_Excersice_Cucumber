@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc12
  Scenario: TC12 Add Products in Cart
    Given Launch browser and Navigate to url "autoExUrl"
    And Verify that home page is visible successfully
    And Click on Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price