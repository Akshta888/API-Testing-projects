Feature: Create nested complex JSON and array

	Scenario: Create Complex JSON payload and Array
	* def jsonObjectPayload = {Emp_Name:'AKS'}
  * set jsonObjectPayload
  |path       | value        |
  |Employee_id|	123           |
  |Emp_Name   |"Allen"       |
  |Address[0].street.no|     5|
  |Address[0].street.name|'Dowing'|
  |Address[1].street.no|     12|
  |Address[1].street.name|'Neville'|
  * print jsonObjectPayload
  
  
  Scenario: Create Complex JSON payload
  * def requestpayload = read('payloads/putUserfile.json')
  * set requestpayload.details
  |path       | value        |
  |Employee_id|	123           |
  |Emp_Name   |"Allen"       |
  * print requestpayload
 
   
    Scenario: Create Complex JSON payload
  * def requestpayload = read('payloads/JsonArray.json')
  * print requestpayload
  * print karate.jsonPath(requestpayload,'$.employee.store.books[*].name')
  * print karate.get('$requestpayload.employee.store.books[*].author')
  * print karate.jsonPath(requestpayload,'$.employee.store.books[?(@.author=="Cormen")].name')
   
   
   