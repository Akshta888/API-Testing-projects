Feature: Fuzzy Matchers examples

	Scenario: Use matchers
  		* def jsonObj =
  		"""
  		{
  		   "id" :"123",
  		   "dob":1991,
  		   "country_code":"AU"
  		}
  		"""
  		* match jsonObj.id == "123"
  		* match jsonObj.id == '#string'
  		* match jsonObj.dob == '#number'
  		* match jsonObj.country_code == '#present'
  		
  	
  	Scenario: Use matchers with Json Array
  		* def jsonResponse =
  		"""
  		{
  		   "id" :"123",
  		   "dob":1991,
  		   "country_code":"AU",
  		   "skills":[
  		   "Java",
  		   "Python",
  		   ".Net"
  		   ]
  		}
  		"""
  		* match jsonResponse.skills == '#array'
  		* match jsonResponse.skills == '#[]'
  #		* match jsonResponse.skills == '#[4]'
    	* match jsonResponse.skills == '#? _[0] == "JAVA"'
  		