/**
 * 
 */
define(['backbone','pag/js/router'],function(Backbone,router){
	var appApi={},
		appObj={},
		appIns;
	
	appApi.start = function(){
		if(appIns === undefined){
			appIns = new appObj.AppController();
		}
	};
	
	appObj.AppController= Backbone.View.extend({
		el:'body',
		
		events:{
			'click button[role="search-file"]':'search'
		},
		
		search:function(){
			var query = $('input[role="search-input"]').val();
			router.navigate("search?q="+query);
			/*$.get('/joeli-rest/?q=check');*/
			console.log('search');
		},
		
		initialize:function(){
			console.log('Initialize pag controller...');
			console.log('Initialize pag controller...done');
		}
	});
	
	return appApi;
});