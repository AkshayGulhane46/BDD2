Feature: Login to orange HRM

  Scenario Outline: ORANGE HRM Sign UP
    Given I open the URL and verify the "<title>" of the page
    When I Send the "<emailId>" and try to click on free button
    And I send the "<userName>", "<fullName>" and "<phoneNumber>"
    And I Select the "<countryName>" and "<stateName>"
    Then I Select the Captcha checkbox and click on submit
    Then test signup should be successful

    Examples:
      | title|emailId | userName| fullName|phoneNumber|countryName|stateName
      | OrangeHRM HR Software |akshaytest345+1@gmail.com | Akshay123 | Akshay Gulhane | 7387870057  | India       | Maharashtra
