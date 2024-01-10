Feature:Use callonce and callSingle()

Background:
 #* def mycall = callonce read('GenerateToken.feature')
 * def mycall = karate.callSingle('GenerateToken.feature')
 * def tokenId = mycall.response.token
 
 Scenario: Print Access token 
 * print mycall
 * print mycall.response.token
 * print tokenId