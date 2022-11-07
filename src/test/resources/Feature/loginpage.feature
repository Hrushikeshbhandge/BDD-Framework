Feature: testing testproject site

  Scenario: Testing login Fucnctionality
    Given user is on loginpage
    Then user enters username
    And user enters password
    And user click on login button
    Then verify the title page
