@tag
Feature:Create New Job with all details
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


@Skills&Education
Scenario:verify recruiter able to add Skills and Education
Given add skills and Education
When add industry field
And add Education

@AdditionalInformation
Scenario:verify recruiter able to add AdditionalInformation
Given click on Additional Information
When add Work Location
And add working Hours
And enter minimal Annual Salary
And enter maximum Annual Salary

@PrescreeningQuestions
Scenario:verify recruiter able to choose pre screening questions
Given add pre screening questions
When click on Add Question button
And Select questions from displayed List
And click on Add Selected option


@Attachments
Scenario:Verify Attachments functionality
Given Click on Attachments section
When upload Attachment file
And click on submit after uploading file

@Logout
Scenario: Verify Recruiter Ai Logout Functionality
Given Click on Logout Button

@CloseBrowser
Scenario: close Browser
Given Close Browser 

