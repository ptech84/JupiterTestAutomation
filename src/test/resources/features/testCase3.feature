Feature: Verify user is able to perform testing on Jupiter e-commerce website

  Background: Launch the Jupiter application
    Given Launch the Jupiter application

  Scenario: Verify user is able to add multiple items to cart and validate the subtotal for each product is correct
    Given From the home page go to shop page
    Then Click buy button twice on "Stuffed Frog"
    Then Click buy button five times on "Fluffy Bunny"
    Then Click buy button thrice on "Valentine Bear"
    Then Click the cart menu
    Then Verify the subtotal for each product is correct


