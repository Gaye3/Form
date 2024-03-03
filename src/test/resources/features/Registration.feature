Feature: Registering new users into the application

  Scenario Outline: To register users successfully into appication.
    Given User navigates to the application url
    Then user is on home page
    When user enters firstname "<FirstName>"
    And User enters lastname "<Lastname>"
    Then user should be registered sucessfully

    Examples: |FirstName|Lastname|
      | Rahul | R |
