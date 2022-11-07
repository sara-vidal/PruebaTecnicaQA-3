Feature: Get the information about sold pets and list their ids and names

  Background:
    * url baseURL

  Scenario: get pets by status (sold) and list them
    Given path 'pet', 'findByStatus'
    And param status = 'sold'
    When method get
    Then status 200

    * def petsList = call read('../scripts/petsList.js') (response)
    # Result:
    * print petsList