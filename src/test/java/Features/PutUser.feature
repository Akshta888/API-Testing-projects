Feature: Update Users
    
    Scenario: Update user using JSON file
    * print tokenID
    Given header Authorization = 'Bearer '+ tokenID
    Given url baseUrl + '/v2/users'
    And path '5899657'
    * def requestpayload = read('payloads/putUserfile.json')
    * set requestpayload.ceo = "XYZ"
    * set requestpayload.skills[0].sub = "JAVA"
    * set requestpayload.skills[1].sub = "Python"
    * print requestpayload
    And request requestpayload
    When method put
    Then status 200
    * print response