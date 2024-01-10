Feature: Call JS functions multiple times in a feature file

Scenario: Call JS function example 1
	* def dataGen = function() {return "events"}
	* def value = karate.repeat(5,dataGen)
	* print value
	
	
	
Scenario: Call java code in JS function example 2
  * def javaUtils = Java.type('Utils.RandomDataGenerator')
  

	#Calling java code in JS function

	* def dataGen = function() { return javaUtils.callFullName() }
  * def data = karate.repeat(5, dataGen)
	* print data
  
 
 	
Scenario: Call feature file in JS function example 3 and N no. of times.
	* def featureUtils = function() { return karate.call('GetUser.feature') }
 	* def data = karate.repeat(5, featureUtils)
	* print data
  
