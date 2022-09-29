@tag
Feature:Collaborators and interview setup

@Login
Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
When User enters valid credentials

@CreateNewJob
Scenario:Verify create new job functionality
Given Recruiter clicks on Jobs Menu 
Then select create new job section
When click on Start button of form
And click on Add New Office button to add new office Address
And add Job Title
And select Job Status
And choose candidates from other countries
And enable rank and file job
And Select Country Location
And Select City location
And add skills
And add Qualification
And add job type
And select minimum experience
And select maximum experience
And choose Employment type
And add no of vacancies
And add Job Description
And add Job Requirements
And choose office location
And click on submit button of job

@EnableCollaborators
Scenario:verify Enable Collaborators toggle functionality
Given Enable collaborator control

@Enableprescreeningsettings
Scenario:verify pre screening Settings
Given enable prescreening settings
When click on Add Question button
And Select questions from Questions List
And click on Add Selected
And ask pre screening questions via chatbot
And enable submit only if candidate answers knockout Questions
And save pre screening Settings

@EnableAutoshortlist
Scenario: verify pre screening shortlist criteria
Given user Enables Autoshortlist button
When user gives passing points
Then Save Autoshortlist settings

@Interviewsetup
Scenario: verify interview setup 
Given user enable interview setup button
When user click on add interview stage
And Choose interview Stage
And choose interview type
And submit interview setup

@Logout
Scenario: Verify Recruiter Ai Logout Functionality
Given Click on Logout Button

@CloseBrowser
Scenario: close Browser
Given Close Browser 
