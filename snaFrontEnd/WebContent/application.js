var SNAFrondEnd=angular.module('SNAFrondEnd',['ngRoute']);

SNAFrondEnd.constant("REST_URI","http://localhost:1010/snaService/")

SNAFrondEnd.config(function($routeProvider) {
	$routeProvider
	.when("/",{
		templateUrl:"index.html",
		controller:"HomeController",
		controllerAs:"homeCtrl"
	})
	.when("/userpage",{
		templateUrl:"user/profile.html",
		controller:"ProfileController",
		controllerAs:"profileCtrl"
	})
	
})