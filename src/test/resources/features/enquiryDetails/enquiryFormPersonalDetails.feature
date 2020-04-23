Feature: Home Insurance Enquiry Form - About you section

  @ui
  Scenario: Enquiry Details page showing correct information
    Given "John" is on the home insurance enquiry details page
    Then He should see the page title "Details - Policy Expert"
    Then He should see the following stages are disabled
      | Quotes  |
      | Extras  |
      | Summary |
      | Payment |
    Then He should see the following section headings
      | About you                      |
      | Statements about you           |
      | About your property            |
      | Statements about your property |
      | About safety and security      |
      | About the joint policyholders  |
      | About your insurance history   |
      | About the cover you want       |
    Then He should see "Go to compare quotes" button


  Scenario: Enquiry Details page - First Name field verification
    Given "John" is on the home insurance enquiry details page
    When He enters first name as "John"
    Then He should see the "John" in the first name field

