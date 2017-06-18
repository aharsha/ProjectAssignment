var UserModule=angular.module('UserModule',[]);

UserModule.controller('ProfileController',function($cookieStore,$rootScope){
	
	$rootScope.currentUser=$cookieStore.get('currentUser');
	
})
