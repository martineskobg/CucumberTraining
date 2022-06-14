Feature: Print Hello World!

  # The second example has three steps
  Scenario: The User is printing "Hello World!"
    Given I Have to say hello
    When I say hello
    Then I should to see "Hello World!" on the console