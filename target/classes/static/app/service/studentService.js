angularApp.service('StudentService',function($http,$q){
	
	var self = this;
	var studentList = [];
	self.submitStudent= function submitStudent(data){
		
		return $http({
			url		:	"http://localhost:8080/api/students/submitStudent",
			method	:	"POST",
			data 	:	data
		}).then(function(success){
			console.log(success);
		},function(error){
			console.log(error);
		})
		
		
	}
	 self.getAllStudents = function getAllStudents(){
		var defer = $q.defer();
		return $http({
			url :"http://localhost:8080/api/students/getAllStudents",
			method :"GET"
		}).then(function(data){
			console.log("i am in service");
			return  data;
		},function(error){
			defer.reject(error);
		});
		return defer.promise();
	}
	 
});