Feature: Search Functionality 

 @Senity
Scenario: Verify Login
Given launch "<url>"
 Then Click on Signinlink
 Then Click on Sign in Button
 Then Enter UserPass and click login
 Then Verify user login successcefully.
 
@Senity
Scenario: Verify Search
Given launch "<url>"
Then Write the product Name
Then Click on Search
Then Verify search result
@Senity
Scenario: Verify 
Given launch "<url>"
Then mouse over to deals
Then mouse over Desktops deals
Then Click For Home
Then Verify Desktop Computer Deals displaying

