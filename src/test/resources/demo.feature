Feature: Login feature
  Scenario: Login with valid credentials
    Given I navigate to "https://demo.broadleafcommerce.org/" page
    And I click Login
    When I enter Email  "humaunk04@hotmail.com/" email
    When I enter Password "Bangladesh004" password
    And I click SignIn Button
    Then I close the Brower