#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Check the Login Functionality

  @TC1
  Scenario Outline: User Wants to Login
    Given user open the app mstqa
    Then user fill in text field username with registered <username>
    And user fill in text field password with registered <password>
    And user tap on login button at Login Screen Page
    Then user tap on logout button at page

    Examples: 
      | username	| password	|
      | mstqa			| P@ssw0rd	|
