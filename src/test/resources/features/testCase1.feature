Feature: Verify user is able to perform testing on Jupiter e-commerce website

  Background: Launch the Jupiter application
    Given Launch the Jupiter application

  Scenario Outline: Verify user is able to submit the contact details
    Given From the home page go to contact page
    Then Populate mandatory fields "<foreName>" "<email>" "<message>"
    And Click submit button
    Then Validate successful submission message "<foreName>"
    Examples:
      | foreName | email          | message                 |
      | John     | john@gmail.com | create contact for John |
      | Tom      | tom@gmail.com   | create contact for Tom   |
      | Jack     | jack@gmail.com  | create contact for Jack  |
      | Jerry    | Jerry@gmail.com | create contact for Jerry |
      | Hill     | hill@gmail.com  | create contact for Hill  |