Feature: Edit Lead

Scenario Outline: Edit Lead 

Given Enter Username <uname>
And Enter Password <password>
And Click on login
And Click CRMSFA link
And Click Leads Tab
And Click on first lead link
And Click on Edit Button
And Edit First Name <fname>
When Click on update lead button

Examples:
|uname|password|fname|
|DemoSalesManager|crmsfa|Syed|