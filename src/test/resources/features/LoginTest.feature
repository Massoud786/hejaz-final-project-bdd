Feature: Login functionality test

  @Login_1
  Scenario: Validate login functionality
    Given user clicks on login button
    When user fills up the login form with map data table
    |username  |supervisor     |
    |password  |tek_supervisor |


    Then user clicks on sign in button
    Then Validate user navigates to Customer Service Portal
    @Login_2
    Scenario: Validate login functionality with wrong credentials
      Given user clicks on login button to navigate to login page
      When User fills up the login form with map data table
        |username  |supervisor_12   |
        |password  |tek_supervisor  |

      Then User clicks on sign in button
      Then Validate error message "User supervisor_12 not found"

      @Login_3
      Scenario: Validate login functionality with valid username and wrong password
        Given user clicks on login button to be taken to login page
        When User fills up the login form with valid username and invalid password using map data table
          |username  |supervisor        |
          |password  |tek_supervisor67  |

        Then User clicks on sign in btn
        Then Validate password error message "Password not matched" as expected

