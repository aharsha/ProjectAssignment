var SNAFrondEnd=angular.module('SNAFrondEnd',['ngRoute','ngCookies','LoginModule','UserModule']);

SNAFrondEnd.constant("REST_URI","http://localhost:1010/snaService/")

SNAFrondEnd.config(function($routeProvider) {
	$routeProvider
	.when("/",{
		templateUrl:"login.html",
		controller:"HomeController",
		controllerAs:"homeCtrl"
	})
	.when("/userpage",{
		resolve:
			{
			  auth:function($rootScope,$location,$cookies){
				  var test=$cookies.get('authenticated');
				  if(!test)
					  {
					     $location.path("/");
					  }
			  }
			},
		templateUrl:"user/profile.html",
		controller:"ProfileController",
		controllerAs:"profileCtrl"
	})
	
	
})