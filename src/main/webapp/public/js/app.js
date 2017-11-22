(function() {
	var app = angular.module('app', ['ngMessages', 'ui.router', 'navController', 'ngAnimate', 'ui.bootstrap', 'ngResource', 'app.controllers', 'app.services'])

	// define for requirejs loaded modules
	define('app', [], function() { return app; });
	
	app.config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
]);
	
	// function for dynamic load with requirejs of a javascript module for use with a view
	// in the state definition call add property `resolve: req('/views/ui.js')`
	// or `resolve: req(['/views/ui.js'])`
	// or `resolve: req('views/ui')`
	function req(deps) {
		if (typeof deps === 'string') deps = [deps];
		return {
			deps: function ($q, $rootScope) {
				var deferred = $q.defer();
				require(deps, function() {
					$rootScope.$apply(function () {
						deferred.resolve();
					});
					deferred.resolve();
				});
				return deferred.promise;
			}
		}
	}

	app.config(function($stateProvider, $urlRouterProvider, $controllerProvider){
		var origController = app.controller
		app.controller = function (name, constructor){
			$controllerProvider.register(name, constructor);
			return origController.apply(this, arguments);
		}

		var viewsPrefix = 'public/views/';

		// For any unmatched url, send to /
		$urlRouterProvider.otherwise("/")

		$stateProvider
			// you can set this to no template if you just want to use the html in the page
			.state('home', {
				url: "/",
				templateUrl: viewsPrefix + "home.html",
				data: {
					pageTitle: 'Home'
				}
			})
			.state('vendors',{
	        url:'/vendors',
	        templateUrl: viewsPrefix + 'vendors.html',
	        controller:'VendorListController'
	    }).state('viewVendor',{
	        url:'/vendors/:id/view',
	        templateUrl: viewsPrefix + 'vendor-view.html',
	        controller:'VendorViewController'
	    }).state('newVendor',{
	        url:'/vendors/new',
	        templateUrl: viewsPrefix + 'vendor-add.html',
	        controller:'VendorCreateController'
	    }).state('editVendor',{
	        url:'/vendors/:id/edit',
	        templateUrl: viewsPrefix + 'vendor-edit.html',
	        controller:'VendorEditController'
	    }).state('customers',{
	        url:'/customers',
	        templateUrl: viewsPrefix + 'customers.html',
	        controller:'CustomerListController'
	    }).state('viewCustomer',{
	        url:'/customers/:id/view',
	        templateUrl: viewsPrefix + 'customer-view.html',
	        controller:'CustomerViewController'
	    }).state('newCustomer',{
	        url:'/customers/new',
	        templateUrl: viewsPrefix + 'customer-add.html',
	        controller:'CustomerCreateController'
	    }).state('editCustomer',{
	        url:'/customers/:id/edit',
	        templateUrl: viewsPrefix + 'customer-edit.html',
	        controller:'CustomerEditController'
	    }).state('Logout',{
	        url:'/logout',
	        templateUrl: 'login.jsp',
	        controller:'LogoutController'
	    }).state('BillPayment',{
	        url:'/billpayment',
	        templateUrl: viewsPrefix + 'billpayment.html',
	        controller:'BillPaymentController'
	    })
	})
	.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {
			return {
				link: function(scope, element) {
					var listener = function(event, toState) {
						var title = 'Project Name';
						if (toState.data && toState.data.pageTitle) title = toState.data.pageTitle + ' - ' + title;
						$timeout(function() {
							element.text(title);
						}, 0, false);
					};

					$rootScope.$on('$stateChangeSuccess', listener);
				}
			};
		}
	]);
}());
