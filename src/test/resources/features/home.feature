@home
Feature: To launching dsalgo application and to test Home page

    @TestSuit_home
    Scenario: Launching home page of an dsalgo project
    Given User opens DS Algo portal link
    When  User clicks Get Started button
    Then  User will be redirected to homepage
    
    @TestSuit_home
    Scenario: From Home page user tries to click on dropdown without loggin in
    Given User is in Home page
    When  User clicks on Data Structures dropdown
    And   Select Array option 
    Then  User to get warning message to login                             
       
    @TestSuit_home
    Scenario: From Home page user clicks on signin link
    Given User in Home page
    When  User clicks on signin link
    Then  User to go to login page

    @TestSuit_home
    Scenario: From Home page user clicks on Register
    Given User is in Home page
    When  User clicks on register link
    Then  User to open Registration page
    
    