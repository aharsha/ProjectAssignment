var LoginModule=angular.module('LoginModule',[]);

LoginModule.controller('LoginController',function(LoginServices,$location,$cookieStore,$cookies,$rootScope){
	
	var loginCtrl=this;
	loginCtrl.user={};
	
	this.login=function()
	{
		console.log(loginCtrl.user);
		LoginServices.login(loginCtrl.user).then(
		function(response)
		{
			console.log(response);
			if(response.status=="200")
				{
				  $cookies.put('authenticated',true);
				  $rootScope.authenticated=$cookies.get('authenticated');
				  $cookieStore.put("currentUser",response.data);
				  $location.path("/userpage")
				}
			if(response.status=="401")
				{
				   $location.path("/");
				}
		}
		)
	
	}
	
})