@home
Feature: To launching dsalgo application and to test Home page

    @TestSuit_home_01
    Scenario: Launching home page of an dsalgo project
    Given User opens DS Algo portal link
    When  User clicks "Get Started" button
    Then  User will be redirected to homepage
    
    @TestSuit_home_02
    Scenario: From Home page user tries to click on dropdown "<option>" - without loggin in
    Given User is in Home page
    When  User clicks on dropdown "<option>"
    And   Select Array option 
    Then  User to get warning message "Need to login to proceed"
    

    @TestSuit_home_03
    Scenario: From Home page, user clicks on getstarted link "<option>" - without logging in
    Given User is in Home page
    When  User clicks on Get Started link on homepage "<option>" -  without logging
    Then  User to get warning message "Need to login to proceed"                                   
    
   
    @TestSuit_home_04
    Scenario: From Home page user clicks on signin link
    Given User in Home page
    When  User clicks on signin link
    Then  User to go to login page

    @TestSuit_home_05
    Scenario: From Home page user clicks on Register
    Given User is in Home page
    When  User clicks on register link
    Then  User to open Registration page
    
    