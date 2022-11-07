Feature: Get the information of the pets and return the number of times each name is used

  Background:
    * url baseURL

  Scenario: get pets by status (all) and print the times each name is used
    Given path 'pet', 'findByStatus'
    And param status = 'available,pending,sold'
    When method get
    Then status 200

    * def petsList = call read('../scripts/petsList.js') (response)
    * def namesList = call read('../scripts/namesList.js') (petsList)
    # Result:
    * print namesList