@tag
Feature:Login and Logout

@Login
Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
When User enters valid credentials

@Logout
Scenario: Verify Recruiter Ai Logout Functionality
Given Click on Logout Button

@CloseBrowser
Scenario: close Browser
Given Close Browser
 


