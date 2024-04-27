Feature:Create New Account Test

  Scenario: Validate form title of create account page
    When User clicks on create primary account button
    Then Validate form page title "Create Primary Account Holder"
@CreateAccount
    Scenario: Fill up the form and create new account
      Given User clicks on create primary account button
      When User fills up the form with list map data table

      |firstName        |Hejaz             |
      |gender          |Male              |
      |employmentStatus|student           |
      |title           |Mr.               |
      |lastName        |Ahmady            |
      |maritalStatus   |Single            |
      |dateOfBirth     |01-08-1999        |
      When user clicks on create account button
      Then Validate user navigates to sign up your account page
      Then Validate email shows as expected on the page
