Feature: Teacher login

  //@Smoke
  Scenario: Teacher login using the email

    Given teacher is on login page
    When teacher enters email and password
    And clicks on the Login button
    Then the teacher is sent  to the explore page