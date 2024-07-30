@Account
Feature: User Creates an account

  @RegisterAccount
  Scenario Outline: User can create an account
    Given the user is on Homepage
    Then the user clicks on Sign in
    And user enters email
      | <Email> |
    And User Clicks create an account
    And User fills sign up form
      | <FirstName> | <LastName> | <Email> | <Pass> | <Company> | <AddressOne> | <AddressTwo> | <City> | <PostalCode> | <OtherInfo> | <HomePhone> | <MobilePhone> | <Alias> |
    And user clicks register
    Then the user is taken my account page
      | <ConfirmAccount> |

    Examples:
      | FirstName | LastName | Email                        | Pass      | Company  | AddressOne  | AddressTwo  | City     | PostalCode | OtherInfo | HomePhone | MobilePhone | Alias          | ConfirmAccount |
      | Sebastian | Londono  | sebas1996000000006@gmail.com | R3alPage. | RealPage | Cr87a#32-81 | Cr87a#32-81 | Medellin | 33206      | Hiring    | 7748954   | 3005647895  | TestAutomation | MY ADDRESSES   |

  @LogInAccount
  Scenario Outline: user can log in account
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    Examples:
      | Email                        | Pass      | ConfirmAccount |
      | sebas1996000000006@gmail.com | R3alPage. | MY ACCOUNT   |
