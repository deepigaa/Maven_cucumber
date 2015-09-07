Feature: Salesforce Login
In order to work
As as sales person 
I want to login

Scenario: Salesforce Login
Given I go to "loginURL" on "Mozilla"
And I enter "loginusername" as "deepigaa1gayathri@gmail.com"
And I enter "loginpassword" as "vishnu@2012"
And I click on "loginButton"
Then login should be "success"