var angularApp=angular.module('angularApp',['ui.router']);
angularApp.config(function($stateProvider,$urlRouterProvider){
	
	$stateProvider
	.state('studentAdmissionForm',{
		url: '/studentAdmissionForm',
		templateUrl: 'app/views/studentAdmissionForm.html',
		controller:'myController'
	});

});