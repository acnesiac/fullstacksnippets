
var x=[{name:"Jhon", hobbies:["cricket","Chess", "Camping" ]},{name:"Sam", hobbies:["PinPong","hockey"]},... ];
//write a function/method: to return string of all hobbies in the above variable x separated by " # " . 
// sample output:   "cricket # Chess # Camping # PinPong # hockey"

function hobbies(){              
  var res = [];
  for (var i= 0 ; i < x.length ; i++){
    var y =x[i].hobbies;
    Object.key
    for (var j ; j < y.length ; j++){
      res.push(y[j] + '#');
    }       
  }
  return res.splice(0,res.length -1)
}

//---------------------------------------------------------------
var a = [1,2,3,4,5];
var b = a;
var c = b.concat();
b[1] = 100;
console.log("a = ",a[1] )
console.log("b = ",b[1] )
console.log("c = ",c[1] )

100
100
2

//-------------------------------------


(function x(){
	var d = 10;
	console.log("a=",d);  
	setTimeout(function(){
				console.log("b=",d); 
				d=15;
       },1000);
		d=12
	console.log("c=",d);  
});

a = 10
c = 12
b = 12
//-------------



a () {  
  x= s1()//asyc call
  y= s2()//asyc call
  Promise.All[x,y].then(function (revoke, response){
    abc(response.x, response.y);
  }
  )  
}


abc(x,y){
  return x+y;
}







