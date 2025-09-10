Feature: This test validates a Health Care Demo app

  Scenario: Validate whether the app is working
    Given User navigates to the Health app
    When User clicks on first button
    Then User should see the next page

  @smoke
  Scenario: Validate New User Account Creation
    Given User navigates to the Health app
    When User clicks on Next button
    Then Then Confirm the Start page displayed
    When User clicks on GET STARTED button
    Then Then Confirm the Licence Agreement page is displayed
    When User clicks the AGREE AND CONTINUE button
    Then Then Confirm the Select Your County page is displayed
    When User select India radio button
    Then User should see the Where is your clinic page
    When User select clinic from the list
    Then Then Confirm the Your Phone Number page is displayed
    When User enter a valid new user phone number
    And  Click the NEXT button
    Then Then Confirm the Your role and full name page is displayed
    When User enter a new role and full name
#    And  Click the NEXT button
    Then Confirm the Create your security PIN page is displayed
    When User enter a valid pin
    Then Confirm Enter security PIN again page is displayed
    When User re-enter a valid pin
    Then Confirm the Location access page is displayed
    When User click the SKIP button
    Then Confirm the Enter facility name page is displayed
    When User select facility
    And  User select YES button to confirm
    Then Then Confirm the How to use simple App page is displayed
    When User click the SKIP button
    Then Confirm the user is navigated to the facility homepage

  Scenario: Validate Current User Account
    Given User navigates to the Health app
    When User clicks on Next button
    Then Then Confirm the Start page displayed
    When User clicks on GET STARTED button
    Then Then Confirm the Licence Agreement page is displayed
    When User clicks the AGREE AND CONTINUE button
    Then Then Confirm the Select Your County page is displayed
    When User select India radio button
    Then User should see the Where is your clinic page
    When User select clinic from the list
    Then Then Confirm the Your Phone Number page is displayed
    When User enter a valid phone number
    And  Click the NEXT button
    Then Then Confirm the Your role and full name page is displayed
    When User enter a valid pin
    Then Confirm the user is navigated to the facility homepage










