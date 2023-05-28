Feature: Login
 
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Log Out link
    Then page title should be "Your store. Login"
    And Close browser
 
  Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "<email>" and Password as "<password>"
    And click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Log Out link
    Then page title should be "Your store. Login"
    And Close browser
    
    Examples:
    | email | password |
    | admin@yourstore.com | admin |
    | admin1.yourstore.com | admin123 |
