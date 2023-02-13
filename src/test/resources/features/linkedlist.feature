@Linkedlist
Feature: User Testing Linkedlist page

   @TS_ll_01
   Scenario:  navigate to Introduction in Linked List page from signin
   Given user is in  Linked List page after logged in
   When The user clicks "Introduction" button
   Then user should be redirected to "Introduction" page

   @TS_ll_02
   Scenario: navigate to Introduction and open editior		
   Given user is in Introduction page after logged in
   When user clicks "Try Here" button in Introduction  page
   Then user should be redirected to  Introduction tryEditor with a Run button to test
   
   @TS_ll_03
   Scenario: navigate to Creating Linked List from signin		
   Given user is in  Linked List page after logged in
   When The user clicks "Creating Linked List" button
   Then user should be redirected to "Creating-Linked-List" page

   @TS_ll_04
   Scenario: Open editor from Creating Linked List  page		
   Given user is in   Creating Linked List  after logged in
   When user clicks "Try Here" button in Creating Linked List Page 
   Then user should be redirected to Creating Linked List tryEditor with a Run button to test

   @TS_ll_05
   Scenario: navigate to Types of Linked List from signin			
   Given user is in  Linked List page after logged in
   When The user clicks "Types of Linked List " button
   Then user should be redirected to "Types-of-Linked-List " page

   @TS_ll_06
   Scenario: Open editor from Types of Linked List page		
   Given user is in Types of Linked List page after logged in
   When user clicks "Try Here" button in Types of Linked List page
   Then user should be redirected to a page Types of Linked List an tryEditor with a Run button to test

   @TS_ll_07
   Scenario: navigate to Implement Linked List in Python from signin			
   Given user is in  Linked List page after logged in
   When The user clicks "Implement Linked List in Python" button
   Then user should be redirected to "Implement-Linked-List-in-Python" page
 
   @TS_ll_08
  Scenario: Open editor from Implement Linked List in Python page		
  Given user is in  Implement Linked List in Python after logged in
  When user clicks "Try Here" button in Implement Linked List in Python page
  Then user should be redirected to a page Implement Linked List an tryEditor with a Run button to test

   @TS_ll_09
   Scenario: navigate to Traversal from signin			
   Given user is in  Linked List page after logged in
   When The user clicks "Traversal" button
   Then user should be redirected to "Traversal" page
 
    @TS_ll_10
   Scenario: Open editor from Traversal page		
  Given user is in Traversal after logged in
  When The user clicks "Try Here" button in Traversal page
  Then user should be redirected to a page  Traversal tryEditor with a Run button to test


   @TS_ll_11
   Scenario: navigate to Insertion from signin			
   Given user is in  Linked List page after logged in
   When The user clicks "Insertion" button
   Then user should be redirected to "Insertion" page
 

   @TS_ll_12
    Scenario: Open editor from Insertion page		
  Given user is in Insertion after logged in
  When The user clicks "Try Here" button in Insertion page
  Then user should be redirected to insertion tryEditor page to Run button to test



   @TS_ll_13
  Scenario: navigate to Deletion from signin			
   Given user is in Insertion after logged in
   When The user clicks "Deletion" button
   Then user should be redirected to "Deletion" page
   
     
   @TS_ll_14
    Scenario: Open editor from Deletion page		
  Given user is in Deletion after logged in
  When The user clicks "Try Here" button in Deletion page
  Then user should be redirected to Deletion tryEditor to Run button to test and Submit button
  
  
   