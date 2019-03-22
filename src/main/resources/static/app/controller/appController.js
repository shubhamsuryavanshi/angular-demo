angularApp.controller('myController',['$scope','StudentService',function($scope,StudentService){
	$scope.student = {};
	$scope.students = [];

	$scope.getAllStudents = function(){
		console.log("getAllstudents");
	$scope.students = StudentService.getAllStudents().then(
		function(success){
			console.log("i am in controller");
			$scope.students = success.data.content;
			console.log(success.data.content);
		},
		function(error){
			console.log(error);
		});
	}
	$scope.getAllStudents();
	
	$scope.submitStudent = function(){
		StudentService.submitStudent($scope.student);
		
	}
	
	
}]);
