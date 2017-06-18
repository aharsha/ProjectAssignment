SNAFrondEnd.controller('HomeController',function(HomeServices,$rootScope,$route,$cookies,$location,$window){
	
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
		$cookies.remove('authenticated');
		$rootScope.authenticated=false;
		$location.path("/")
	}
	
	
	
})