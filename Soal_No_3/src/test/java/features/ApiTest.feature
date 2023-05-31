Feature: User Information
	
	Background: 
	  * url 'https://jsonplaceholder.typicode.com/posts'

  Scenario: Match the response data types
    Given path '/1'
    When method GET
    Then status 200
    And match response.id == '#number'
    And match response.title == '#string'
    And match response.body == '#string'
    And match response.userId == '#notnull'

