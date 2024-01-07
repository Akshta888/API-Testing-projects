Feature: Get Users
    
    Scenario: 
    Given url 'https://gorest.co.in/public/v2/users?id=5899210'
    When method get
    Then status 200
    * print response
    
    
    Scenario: 
    Given url 'https://gorest.co.in/public'
    And path 'v2/users/5899665'
    When method get
    Then status 200
    * print response
    And match responseStatus == 200
    And assert responseStatus == 200
    * print responseHeaders
    And print responseHeaders ["Content-Type"][0]
     And match header Content-Type == "application/json; charset=utf-8"
    And match header Content-Type contains "application/json"
   #And match karate.response.header ('Content-Type') == 'application/json; charset=utf-8'
 		And match response  == {"id":5899665,"name":"Sanka Marar","email":"sanka_marar@thompson-brakus.example","gender":"male","status":"active"}
   And match response.name == 'Sanka Marar'