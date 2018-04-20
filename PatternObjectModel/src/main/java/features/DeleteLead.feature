Feature: Delete Lead

Scenario Outline: Delete Lead 

Given Enter Username <uname>
And Enter Password <password>
And Click on login
And Click CRMSFA link
And Click Leads Tab
And Click on Find Leads Link
And Enter First Name <fname>
And Click Find Leads Button
And Click on first lead link
When Click on Delete Button

Examples:
|uname|password|fname|
|DemoSalesManager|crmsfa|Syed|