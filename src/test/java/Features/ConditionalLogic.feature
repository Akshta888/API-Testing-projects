@Regression
Feature: Conditional logic

Scenario: if-else
  * def status = 200
  * def value = status == 200 ? 'Success': 'Failed'
  * print value
  
Scenario: if-else with && ||
  * def status = 201
  * def flag = false
  * def value = status == 200 && flag == true ? 'Success': 'Failed'
  * print value
  * def value1 = status == 200 ? flag == true ? "SuccessFlag": "FailedFlag": "Success"
   * print value1
   
 Scenario: call feature file in if-else
  * def status = 200
 	* def value = status == 200 ? karate.call('GetUser.feature'): 'Failed'
  * print value
  
 Scenario: call feature file in if-else
  * def status = 201
 	* def value = if(status == 200) karate.call('GetUser.feature')
  * print value
  