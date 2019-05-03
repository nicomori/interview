@Case_2A1
Feature: Interview Nicolas Mori

  Scenario Outline: Access to the app after make the login.
    Given I start the android web test with this device "<device uuid>"
    And navigate to this "<url>" in the mobile web
    Then in the homepage make click in the button to sign in
    Then make a success login
    Then in the dashboard page make click in the dropdown, and select this coin "<option coin>"
    Then select this option "<option menu>" from the menu
    Then validate if the values in the menu change

    Examples: 
      | device uuid      | url                    | option menu | option coin |
      | 8575525242395141 | https://www.kraken.com | Security    | ETH/XBT     |
