
var arr = [9,4,7,2];
const chunkedArr = [];
let i = 0;
let len = 2;

arr = arr.sort();

var min = Math.min.apply(null,arr);
while (i < arr.length) {
	 var sliced = arr.slice(i, i + len);
	 var res = Math.max.apply(null,sliced) - Math.min.apply(null,sliced);
	 console.log(res);
     if( res < min ) { 
     		min = res;
     }
     i += len;
}
console.log(min);

