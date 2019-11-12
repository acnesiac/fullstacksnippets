var arr = [1,2,3,4,5,6];
var a = arr.reduce(function(count,acum){
		return count += acum;
} );
console.log(a);