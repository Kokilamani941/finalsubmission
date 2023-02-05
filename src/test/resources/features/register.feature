Feature: To register new user 

@Test_suit_register01
Scenario: User missed to give credentials
  Given User is in Register page regone
  When  User not giving any valid userId regone
  And   User not giving valid password and valid password confirmation regone
  And   User clicks on Register button regone
  Then  Error enter valid username & password regone

@Test_suit_register02
Scenario: User failed to give valid username
  Given User is in Register page regtwo
  When  User not giving valid userId regtwo
  And   User giving valid password and valid password confirmation regtwo
  And   User clicks on Register button regtwo
  Then  Error no special charecters and numbers allowed regtwo
  
@Test_suit_register03
Scenario: User failed to give valid password
  Given User is in Register page regthree
  When  User giving valid userId regthree
  And   User not giving valid password and valid password confirmation regthree
  And   User clicks on Register button regthree
  Then  Error enter valid password regthree
 
@Test_suit_register04
Scenario: User failed to enter confirm password
  Given User is in Register page regfour
  When  User giving valid userId regfour
  And   User giving valid password and invalid password confirmation regfour
  And   User clicks on Register button regfour
  Then  Error your confirm password is incorrect regfour

@Test_suit_register05
Scenario: Register new user
  Given User is in Register page regfive
  When  User to give valid userId regfive
  And   User to give valid password and valid password confirmation regfive
  And   User clicks on Register button regfive
  Then  Validate success message regfive
      
