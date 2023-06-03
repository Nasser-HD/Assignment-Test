Feature: Assert the package in the SA version
As a customer
I want to see stcTV package page in SA country
So I can view the Package details with revelent informations

Background: 
Given The customer in the main subscription page
When The customer go to SA version


Scenario: Package name
Then The customer should be able to view Package name

Scenario: Package price
Then The customer should be able to view Package price
