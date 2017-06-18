SNAFrondEnd.controller('HomeController',function(HomeServices,$route,$location){
	
	this.message="this is home controller";
	var homeCtrl=this;
	this.user={};
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
	
})