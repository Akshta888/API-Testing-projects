Feature: Use @setup with examples

@setup
Scenario:
  * def jsonpayload = read('payloads/MOCK_DATA.json')
  * print jsonpayload
  
  

Scenario Outline: Read from JSON file <name>
  * print __row

	Examples:
		  | karate.setupOnce().jsonpayload |