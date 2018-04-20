Feature: Create Lead

Scenario Outline: Create Lead 

Given Enter Username <uname>
And Enter Password <password>
And Click on login
And Click CRMSFA link
And Click Leads Tab
And Click Create Lead
And Enter Company Name <cname>
And Enter First Name <fname>
And Enter Last Name <lname>
When Click on Create lead button


Examples:
|uname|password|cname|fname|lname|
|DemoSalesManager|crmsfa|Leaftaps|Syed|Musavir|