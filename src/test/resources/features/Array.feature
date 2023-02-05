@home
Feature: launching dsalgo application load Array page

@TestSuit_Array_01
Scenario: navigate to Arrays in Python from signin
Given user is in  Array page after logged in
When user clicks "Arrays in Python" button
Then user should be redirected to "arrays-in-python" page

@TestSuit_Array_02
Scenario: navigate to Arrays in Python and open editior		
Given user is in  Arrays in Python page after logged in
When user clicks "Try Here" button in Arrays in Python page
Then user should be redirected to a page having an tryEditor with a Run button to test

@TestSuit_Array_03
Scenario: navigate to Arrays using List from signin		
Given user is in  Array page after logged in
When user clicks "Arrays using List" button
Then user should b9e redirected to "arrays-using-list" page

@TestSuit_Array_04
Scenario: Open editor from Arrays using List page		
Given user is in  Arrays using List page after logged in
When user clicks "Try Here" button in Arrays using List page
Then user should be redirected to a page having an tryEditor with a Run button to test

@TestSuit_Array_05
Scenario: navigate to Basic Operations in List from signin			
Given user is in  Array page after logged in
When user clicks "Basic Operations in List" button
Then user should be redirected to "basic-operations-in-lists" page

@TestSuit_Array_06
Scenario: Open editor from Basic Operations in List page		
Given user is in  Basic Operations in List page after logged in
When user clicks "Try Here" button in Arrays using List page
Then user should be redirected to a page having an tryEditor with a Run button to test

@TestSuit_Array_07
Scenario: navigate to Applications of Array from signin			
Given user is in  Array page after logged in
When user clicks "Applications of Array" button
Then user should be redirected to "applications-of-array" page
		
@TestSuit_Array_08
Scenario: Open editor from Applications of Array page		
Given user is in  Applications of Array page after logged in
When user clicks "Try Here" button in Applications of Arrays page
Then user should be redirected to a page having an tryEditor with a Run button to test
		
@TestSuit_Array_09
Scenario: Launching Practice Questions page of an dsalgo project		
Given user is in  Array page after logged in
When user clicks "Practice Questions" button
Then user should be redirected to "practice" page
		
@TestSuit_Array_10
Scenario: Launching Search  array link of an dsalgo project		
Given user is in  Practice page
When user clicks "Search the array" link
Then user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
		
@TestSuit_Array_11
Scenario: Launching Max Consecutive Ones link of an dsalgo project		
Given user is in  Practice page
When user clicks "Max Consecutive Ones" link
Then user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
		
@TestSuit_Array_12
Scenario: Launching Find Numbers with Even Number of Digits link of an dsalgo project		
Given user is in  Practice page
When user clicks "Find Numbers with Even Number of Digits" link
Then user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
		
@TestSuit_Array_13
Scenario: Launching Squares of a  Sorted Array link of an dsalgo project		
Given user is in  Practice page
When user clicks "Squares of a Sorted Array" link
Then user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
