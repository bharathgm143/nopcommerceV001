Feature: Customers

Background: Below are the common steps for all Scenario
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then User Can View Dashboard

Scenario: Add new customer
		When user click on customers Menu
		And click on customer Menu Item
		And click on Add new button
		Then User can view Add new customer page
		When User enter customer info
		And click on Save button
		Then User can view confirmation message "The new customer has been added successfully."
		And close browser 
		
Scenario: Search customer	by Email id
		When user click on customers Menu
		And click on customer Menu Item
		And Enter customer Email
		When Click on Search button
		Then User should find email in the search table
		And close browser
		
Scenario: Search customer	by Name
		When user click on customers Menu
		And click on customer Menu Item
		And Enter customer FirstName
		And Enter customer LastName
		When Click on Search button
		Then User should find Name in the search table
		And close browser
		
		