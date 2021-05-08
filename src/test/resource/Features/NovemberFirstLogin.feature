@NovemberFirst_Assignment
Feature: NovermberFirst Login pages automation Assignment

  @LoginPage_signup
  Scenario Outline: Verify NovermberFirst Login pages link & Signup Validation
    Given Load the browser and Navigate to URL
    When Click on country dropdown
    And Verify  on Loginpage SignUp link is displaying
    And Verify  on Loginpage ForgotPassword link is displaying
    And Click on signup link
    And Enter "<CVR>" and  "<FIRSTNAME>"  and "<LASTNAME>" and "<EMAIL>" and "<CONFIRMEMAIL>" and  "<PHONE>" details
    And Click on checkbox & click on create acount
    Then Validate you navigate to email confirm screen

    Examples: 
      | CVR      | FIRSTNAME | LASTNAME | EMAIL                   | CONFIRMEMAIL            | PHONE      |
      | 25628470 | Kumar     | Omnath   | kumaromnath14@gmail.com | kumaromnath14@gmail.com | 8095303178 |

  @Login_Page
  Scenario Outline: Verify NovermberFirst Login validation
    Given Load the browser and Navigate to URL
    When Click on country dropdown
    And Enter "<CustomerNumber>" and  "<Email>"  and "<Password>"  details
    And Verify checkbox is selected & clcik on LoginButton
    Then Verify error message on the screen

    Examples: 
      | CustomerNumber | Email                   | Password       |
      |     8095303178 | kumaromnath14@gmail.com | Kumar@12345GRD |
