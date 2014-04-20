/**
 * 
 */
define(['backbone']
,function(Backbone){
	var routerApi = {},
		routerObj = {},
		routerInstance;
	
	routerApi.start = function(){
		if(routerInstance === undefined){
			routerInstance = new routerObj.Router();
			Backbone.history.start();
		}
	};
	routerApi.navigate = function(route){
		routerInstance.navigate(route,true);
	};
	
	routerObj.Router = Backbone.Router.extend({
		routes:{
			'home':'home',
			'search?q=:query':'search',
			'*path':'invalidPath'
		},
		
		home:function(){
			console.log('home path');
		},
		
		search:function(query){
			$.get('/joeli-rest/service/file/pdf?q='+query);
			console.log('query '+query);
		},
		
		invalidPath:function(path){
			console.log('invalid Path '+ path);
			console.log('Redirect to home');
			this.navigate('home',true);
		},
		
		initialize:function(){
			console.log('Initialize router');
			console.log('Initialize router...done');
		}
	});
	
	return routerApi;
});