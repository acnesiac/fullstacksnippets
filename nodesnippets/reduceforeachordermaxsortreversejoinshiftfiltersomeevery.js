var arr = [1,2,3,4,5,6,7,8,9,0];
var res = [];
console.log(arr);

res = arr.sort();
console.log(res);

res = arr.filter( ( a, b ) => a===3);
console.log(res);

res = arr.reverse();
console.log(res);

res = arr.reduce((a,b) =>  a +b );
console.log(res);

arr.forEach(function (key,index){
 console.log(key,index)
});



