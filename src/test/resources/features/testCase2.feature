Feature: Verify user is able to perform testing on Jupiter e-commerce website

  Background: Launch the Jupiter application
    Given Launch the Jupiter application

  Scenario: Verify user is able to add items to the cart and validate the items are available in the cart
    Given From the home page go to shop page
    Then Click buy button twice on “Funny Cow”
    And Click buy button once on “Fluffy Bunny”
    Then Click the cart menu
    Then Verify the items are in the cart