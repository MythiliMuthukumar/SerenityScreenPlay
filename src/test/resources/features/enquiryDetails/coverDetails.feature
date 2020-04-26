@ui
Feature: Home Insurance Enquiry Form - Cover Details Section

  Scenario: Enquiry Details page - Shows Cover details question, Today & Tomorrow option
    Given "John" is on the home insurance enquiry details page
    Then he should see the "When would you like cover to start?" question
    Then he should see the cover start date "Today" button
    Then he should see the cover start date "Tomorrow" button

  Scenario: Enquiry Details page - Cover start today date verification
    Given "John" is on the home insurance enquiry details page
    When he clicks cover start date "Today" button
    Then he should see "Today" date in the cover start date field

  Scenario: Enquiry Details page - Cover start tomorrow date verification
    Given "John" is on the home insurance enquiry details page
    When he clicks cover start date "tomorrow" button
    Then he should see "tomorrow" date in the cover start date field