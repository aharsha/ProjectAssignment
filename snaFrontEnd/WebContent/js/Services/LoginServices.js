LoginModule.service('LoginServices',function($http,$q,REST_URI)
{
	this.login=function(user)
	{
		var deffered=$q.defer();
		$http.post(REST_URI+"login",user)
		.then(
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
})