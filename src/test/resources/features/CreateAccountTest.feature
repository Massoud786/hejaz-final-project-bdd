Feature:Create New Account Test

  Scenario: Validate form title of create account page
    When User clicks on create primary account button
    Then Validate form page title "Create Primary Account Holder"
@CreateAccount_1
    Scenario: Fill up the form and create new account
      Given User clicks on create primary account button
      When User fills up the form with list map data table
      |email           |hejaz_12099@gmail.com|
      |firstName       |Hejaz                |
      |gender          |Male                 |
      |employmentStatus|student              |
      |title           |Mr.                  |
      |lastName        |Ahmady               |
      |maritalStatus   |Single               |
      |dateOfBirth     |01-08-1999           |
      When user clicks on create account button
      Then Validate user navigates to sign up your account page
      Then Validate email shows as expected on the page

  @CreateAccount_2
  Scenario: Validate account creation with existing email address
    Given User navigates to account creation page
    When user fills up the form with existing credential using map data table
      |email           |Hejaz_12@gmail.com|
      |firstName       |Hejaz                |
      |gender          |Male                 |
      |employmentStatus|student              |
      |title           |Mr.                  |
      |lastName        |Ahmady               |
      |maritalStatus   |Single               |
      |dateOfBirth     |01-08-1999           |

    Then click on create account button
    Then Validate error message "Account with email Hejaz_12@gmail.com is exist" as expected

