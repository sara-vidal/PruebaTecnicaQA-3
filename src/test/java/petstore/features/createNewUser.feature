Feature: Create a new user and retrieve their information

  Background:
    * url baseURL

  Scenario: post a new user and get their information by username
    * def user = read('../data/user.json')
    Given path 'user'
    And header Content-Type = 'application/json'
    And header Accept = 'application/json'
    And request user
    When method post
    Then status 200

    * def username = user.username

    Given path 'user',username
    And header Accept = 'application/json'
    When method get
    Then status 200

    # Result:
    * print response