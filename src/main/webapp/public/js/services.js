angular.module('app.services', []).factory('Vendor', function($resource) {
	  return $resource('/api/v2/vendors/:id', { id: '@id' }, {
		    update: {
		      method: 'PUT'
		    }
		  });
		}).factory('Customer', function($resource) {
			  return $resource('/api/v3/customers/:id', { id: '@id' }, {
				    update: {
				      method: 'PUT'
				    }
				  });
				}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
