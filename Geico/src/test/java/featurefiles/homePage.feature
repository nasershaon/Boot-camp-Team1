Feature: Gieco Home
  Background: Gieco HomePage
    Given I am at Gieco HomePage

    Scenario: Left menu Check
      Given I am Clicking LeftMenuButton
      Then Browser close

    Scenario: Test Information link check
      Given I am Clicking Information
      Then Browser close

    Scenario: Test MainMenu checking
      Given I am Clicking Main menu Gaico home page
      Then Browser close

    Scenario: checking Gps Button
      Given I am Clicking GPS Button
      Then Browser close

    Scenario: checking Zip Code Button
      Given I am Clicking ZipCode Button and putting zip code
      Then Browser close

    Scenario: checking LogIn Button
    Given I am Clicking LogIn Button
    Then Browser close

   Scenario: checking Search Button
    Given I am Clicking Search Button
    Then Browser close

    Scenario: checking Test Vehicle Insurance Button
    Given I am Clicking Test Vehicle Insurance Button
    Then Browser close

  Scenario: checking test Property Insurance
    Given I am Clicking Test Property Insurance Button
    Then Browser close

  Scenario: checking business Insurance link
    Given I am Clicking Test business Insurance Button
    Then Browser close

  Scenario: checking additional Insurance link
    Given I am Clicking additional Insurance Test additional Insurance link
    Then Browser close

  Scenario: checking My Account link
    Given I am Clicking myAccount Test myAccount link
    Then Browser close

  Scenario: checking claims link
    Given I am Clicking claims link
    Then Browser close

    Scenario: checking link
      Given i am checking gaico homepage
      Then  Browser close

      Scenario:
        Given im in gaoco homepage
        And search in webelement 5 element form xls file
        Then im press search button



