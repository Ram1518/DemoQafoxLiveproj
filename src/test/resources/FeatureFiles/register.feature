Feature: Registration functionality scenarios

 Scenario: Verify whether the user is able register into the appilication by providng all the details
    Given I lauch the application
    And I navigate to Refgister page
    When I provide all the below valid details
       | FirstName | Sai                     |
       | LastName  | ram                     |
       | Email     | sairam1999asr@gmail.com |
       | Telephone | 9502293382              |
       | Password  | Sai@1999                |
    And i Select the privacy policy 
    And I Click on continue button
    Then I should see does the use account has been created successfully