angular.module('app.controllers', []).controller('VendorListController', function($scope, $state, popupService, $window, Vendor) {
	  $scope.vendors = Vendor.query(); 
	  
	  $scope.submitCustomerForm = function(){
		  $scope.customer.vendorName = $scope.vName.vendorName;

		
		}
	  
	  $scope.deleteVendor = function(vendor) {
	    if (popupService.showPopup('Really delete this?')) {
	      vendor.$delete(function() {
	        $scope.vendors = Vendor.query(); 
	        $state.go('vendors');
	      });
	    }
	  };
	}).controller('VendorViewController', function($scope, $stateParams, Vendor) {
	  $scope.vendor = Vendor.get({ id: $stateParams.id }); //Get a single shipwreck.Issues a GET to /api/v1/shipwrecks/:id
	}).controller('VendorCreateController', function($scope, $state, $stateParams, Vendor) {
	  $scope.vendor = new Vendor();  //create new shipwreck instance. Properties will be set via ng-model on UI

	  $scope.addVendor = function() { //create a new shipwreck. Issues a POST to /api/v1/shipwrecks
	    $scope.vendor.$save(function() {
	      $state.go('vendors'); // on success go back to the list i.e. shipwrecks state.
	    });
	  };
	}).controller('VendorEditController', function($scope, $state, $stateParams, Vendor) {
	  $scope.updateVendor = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/shipwrecks/:id
	    $scope.vendor.$update(function() {
	      $state.go('vendors'); // on success go back to the list i.e. shipwrecks state.
	    });
	  };

	  $scope.loadVendor = function() { //Issues a GET request to /api/v1/shipwrecks/:id to get a shipwreck to update
	    $scope.vendor = Vendor.get({ id: $stateParams.id });
	  };

	  $scope.loadVendor(); // Load a shipwreck which can be edited on UI
	}).controller('CustomerListController', function($scope, $state, popupService, $window, Customer) {
		  $scope.customers = Customer.query(); //fetch all shipwrecks. Issues a GET to /api/vi/shipwrecks

		  $scope.deleteCustomer = function(customer) { // Delete a Shipwreck. Issues a DELETE to /api/v1/shipwrecks/:id
		    if (popupService.showPopup('Really delete this?')) {
		      customer.$delete(function() {
		        $scope.customers = Customer.query(); 
		        $state.go('customers');
		      });
		    }
		  };
		}).controller('CustomerViewController', function($scope, $stateParams, Customer) {
		  $scope.customer = Customer.get({ id: $stateParams.id }); //Get a single shipwreck.Issues a GET to /api/v1/shipwrecks/:id
		}).controller('CustomerCreateController', function($scope, $state, $stateParams, Customer) {
		  $scope.customer = new Customer();  //create new shipwreck instance. Properties will be set via ng-model on UI

		  $scope.addCustomer = function() { //create a new shipwreck. Issues a POST to /api/v1/shipwrecks
		    $scope.customer.$save(function() {
		      $state.go('customers'); // on success go back to the list i.e. shipwrecks state.
		    });
		  };
		}).controller('CustomerEditController', function($scope, $state, $stateParams, Customer) {
		  $scope.updateCustomer = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/shipwrecks/:id
		    $scope.customer.$update(function() {
		      $state.go('customers'); // on success go back to the list i.e. shipwrecks state.
		    });
		  };

		  $scope.loadCustomer = function() { //Issues a GET request to /api/v1/shipwrecks/:id to get a shipwreck to update
		    $scope.customer = Customer.get({ id: $stateParams.id });
		  };

		  $scope.loadCustomer(); // Load a shipwreck which can be edited on UI
		}).controller('CountryController', ['$scope',
	        function($scope) {
			$scope.countries = [{
			    "name": "USA",
			    "id": 1
			  },{
			    "name": "Canada",
			    "id": 2
			}];
			$scope.states = [{
			    "name": "Alabama",
			    "id": 1,
			    "countryId": 1
			  }, {
			    "name": "Alaska",
			    "id": 2,
			    "countryId": 1
			  }, {
			    "name": "Arizona",
			    "id": 3,
			    "countryId": 1
			  }, {
			    "name": "Alberta",
			    "id": 4,
			    "countryId": 2
			  }, {
			    "name": "British columbia",
			    "id": 5,
			    "countryId": 2
			}];
			
			$scope.updateCountry = function(){
				  $scope.availableStates = [];

				  angular.forEach($scope.states, function(value){
				    if(value.countryId == $scope.country.id){
				      $scope.availableStates.push(value);
				    }
				  });
				}
			
			$scope.updateVendor = function(){
				  $scope.vendor.vendorCountry = $scope.country.name;
				  $scope.vendor.vendorState = $scope.state.name;

				
				}
			$scope.updateCustomer = function(){
				  $scope.customer.customerCountry = $scope.country.name;
				  $scope.customer.customerState = $scope.state.name;

				
				}

	          
	        }
	      ]).controller('BillPaymentController', function($scope, $stateParams, Vendor) {
			  console.log("Bill Payment Page opening");
		});
