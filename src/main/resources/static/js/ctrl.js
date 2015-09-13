(function () {
	angular
		.module('ctrl', ['ngMaterial', 'ngRoute', 'ngCookies'])
		.controller('AppCtrl', AppCtrl)
		;
	
	function AppCtrl(
			$scope, $mdSidenav, $log, $location, $cookies, $mdDialog) {
		this.name ="AppCtrl";
		
		$scope.toggleSidenav = function(menuId) {
			$mdSidenav(menuId).toggle();
		}
		
		$scope.showView = function(name) {
			$location.path("/view/" + name);
		}
		
		$scope.currentUser = {
				name: "user"
		};
		
		// 串接智宇
		$scope.openDialog = function(ev) {
			$mdDialog.show({
				controller: DialogCtrl,
				templateUrl: 'view/dialog.html',
				parent: angular.element(document.body),
				targetEvent: ev,
				clickOutsideToClose: true
			})
			.then(function(answer) {
				$scope.status = 'You said the information was "' + answer + '".';
			}, function() {
				$scope.status = 'You cancelled the dialog.';
			})
			;
		}
		
		function DialogCtrl($scope, $mdDialog) {
		}
	}
	
})();