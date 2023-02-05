Feature: User to sigin 

@Test_suit_signin01
  Scenario: User missed to give credentials
  Given User is in sigin page regone
  When  User not giving valid userId regone
  And   User not giving valid password regone
  And   User clicks on sigin button regone
  Then  Error enter valid username & password regone
  
@Test_suit_sigin02
  Scenario: User failed to give valid username
  Given User is in signin page regtwo
  When  User not giving valid userId regtwo
  And   User giving valid password regtwo
  And   User clicks on sigin button regtwo
  Then  Error no special characters and numbers allowed regtwo

@Test_suit_signin03
  Scenario: User failed to give valid password
  Given User is in signin page regthree
  When  User giving valid userId regthree
  And   User not giving valid password regthree
  And   User clicks on signin button regthree
  Then  Error enter valid password regthree
     
@Test_suit_signin04
  Scenario: user sigin
  Given User is in signin page regfive
  When  User to give valid userId regfive
  And   User to give valid password regfive
  And   User clicks on signin button regfive
  Then  Validate success message regfive

      
  