Feature: Print Hello World!

  Scenario: The User is printing "Hello World!"
    Given I have to say hello
    When I say hello
    Then I should see Hello World on the console