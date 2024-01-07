Feature: Data driven testing using CSV and JSON files
  
   Scenario Outline: Read data from json file <first_name>
        * def jsondoc =
        """
        first_name = "<name>",
        id = '<id>',
        country = "<country>"
        """
        * print jsondoc
        * print __row
        Examples:
        |read('payloads/MOCK_DATA.json')|
        
    
      Scenario Outline: Read data from csv file <first_name>
        * def jsondoc =
        """
        first_name = "<first_name>",
        id = '<id>',
        last_name = "<last_name>",
        gender = "<gender>"
        
        """
        * print jsondoc
          * print __row
        Examples:
        |read('payloads/MOCK_DATA.csv')|