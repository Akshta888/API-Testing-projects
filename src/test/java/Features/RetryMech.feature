Feature: Retry mechanism

  Scenario: retry
   	* configure retry = {count: 3 , interval: 5000}
   	Given url 'https://gorest.co.in/public/v2/users/5899657'
   	* def utils = Java.type('Utils.JsonUtils')
   #	And retry until responseStatus == 200
   	And retry until utils.wantRetry(karate.toString(response))
   	Then method get
   	And status 200
   	