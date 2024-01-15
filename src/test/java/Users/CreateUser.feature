Feature: Create Users

  Scenario: 
    Given url 'https://gorest.co.in/public/v2/users'
    And request [{"id":5886074,"name":"Vaishno Namboothiri","email":"vaishno_namboothiri@hane.test","gender":"female","status":"active"},{"id":5886073,"name":"Deepesh Kapoor","email":"deepesh_kapoor@beer.test","gender":"female","status":"inactive"}]
    When method post
    Then status 201
    * print response