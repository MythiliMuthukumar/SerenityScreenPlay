@ui
Feature: Home Insurance Enquiry Form - Joint Policy Holder Details Section

  Scenario: Enquiry Details page - Shows the Joint Policy holder question, Yes & No option
    Given "John" is on the home insurance enquiry details page
    Then he should see the "Would you like to add a joint policyholder?" question
    Then he should see the policyholder question "Yes" button
    Then he should see the policyholder question "No" button

  @manual
  Scenario: Enquiry Details page - Clicking Yes button function correctly
    Given "John" is on the home insurance enquiry details page
    When he click Joint policyholder question yes option
    Then he should see the "Add Details" dialog screen
    Then he should see Add Details screen "close" option
    Then he should see the Add Details screen "cancel" button
    Then he should see the Add Details screen "save" button

  @manual
  Scenario: Enquiry Details page - Clicking Yes button function correctly
    Given "John" is on the home insurance enquiry details page
    And he click Joint policyholder question yes option
    When he close the "Add Details" dialog screen
    Then he should see the Add Joint policyholders button