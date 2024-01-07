function fn() {
var config ={
	
	tokenID:'4c82fc7f7610f25869cc0f658553c296494579d39b13eec4f8bd60631dee6a5c',
	baseUrl:'https://gorest.co.in/public'
	
	}
	
	karate.configure('retry',{count: 5 ,interval: 3000})
	return config;
}