SNAFrondEnd.service('HomeServices',function($http,$q,REST_URI){
	this.register=function(user)
	{
		var deffered=$q.defer();
		$http.post(REST_URI+'addClient',user).then
		(
		   function(response)
		   {
			   console.log(response);
			   deffered.resolve(response);
		   },
		   function(error)
		   {
			   console.log(error);
			   deffered.reject(error);
		   }
		)
		return deffered.promise;
		
	}
	
	this.logout=function()
	{
		var deffered=$q.defer();
		$http.get(REST_URI+"logout").then(
			
			function(success)
			{
				deffered.resolve(success);
			},
			function(error)
			{
				deffered.reject(error);
			}
			
		)
		return deffered.promise;
		
		
	}
})