
(function x(){
	var d = 10;
	console.log("a=",d);  
	setTimeout(function(){
				console.log("b=",d); 
				d=15;
       },1000);
		d=12
	console.log("c=",d);  
})();




