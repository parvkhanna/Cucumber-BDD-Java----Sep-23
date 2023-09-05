
@SmokeTest
Feature: Free CRM Login Feature

 Background:
# repeatative steps

  @tag1
  Scenario: Login test scenario
    Given user enters url 
    And title of FreeCRM homePage is displayed
    And user clicked on SignIn Tab to move to sign in page
    Then user enters username and password
    And user clicks on login button
    Then user account page is displayed
    
 
 	@tag2
  Scenario: Verify all menu options
    Given user Home page is displayed
    Then click on calender option in the menu
    And calendar page should be displayed 
