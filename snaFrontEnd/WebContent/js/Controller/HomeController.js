SNAFrondEnd.controller('HomeController',function(HomeServices,$rootScope,$route,$cookies,$location,$cookieStore){
	
	this.message="this is home controller";
	var homeCtrl=this;
	this.user={};
	$rootScope.authenticated=$cookies.get('authenticated');
	this.register=function()
	{
		console.log(homeCtrl.user);
		HomeServices.register(homeCtrl.user).then(
		function(response)
		{
			console.log(response);
			$route.reload();
			
			
		},
		function(error)
		{
			console.log(error);
		}
		)
	}
	
	this.logout=function()
	{
		HomeServices.logout().then(
		function(response)
		{
		$cookies.remove('authenticated');
		$rootScope.authenticated=false;
		$location.path("/");
		},function(error)
		{
		  console.log(error);
		}
		
		)
	}
	
	
	
})