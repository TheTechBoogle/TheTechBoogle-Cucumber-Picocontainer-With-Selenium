Feature: Login feature of web application.

  Scenario Outline: Login to the web app

    Given That I navigate to the web login page.
    When I enter a correct <username> and correct <password>.
    Then I should see the welcome page.
    Examples:
       |username||password|
       | Example123|| abc123 |
