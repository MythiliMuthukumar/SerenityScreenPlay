@ui
Feature: Home Insurance Enquiry Form - Safety and Security Section

  Scenario: Enquiry Details page - Shows Accessible windows key-operated locks question,Yes & No button
    Given "John" is on the home insurance enquiry details page
    Then he should see the "Do all externally accessible windows have key-operated locks on them?" question
    Then he should see the accessible windows question "Yes" button
    Then he should see the accessible windows question "No" button

  @manual
  Scenario: Enquiry Details page - Self-contained question,Yes & No button
    Given "John" is on the home insurance enquiry details page
    Then he should see the "Is your property self-contained, i.e. it has its own front door with its own lockable entrance?" question
    Then he should see the Self-contained question "Yes" button
    Then he should see the Self-contained question "No" button

  Scenario: Enquiry Details page - Self-contained Yes option shows type of lock and its images
    Given "John" is on the home insurance enquiry details page
    When he clicks self-contained "Yes" button
    Then he should see the "Please specify what type of lock is fitted to your main entrance" question
    Then he should see the following lock options and its image
      | 5 lever mortice deadlock                      |
      | 5 lever mortice deadlock conforming to BS3621 |
      | Key operated multipoint locking system        |
      | Rim deadlock                                  |
      | Key operated deadbolts with any other lock    |
      | Other locks                                   |

