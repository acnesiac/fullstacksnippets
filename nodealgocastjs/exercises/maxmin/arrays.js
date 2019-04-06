
var a = [1,2,3,4,5];
var b = a;
var c = b.concat();
b[1] = 100;
console.log("a = ",a[1] )
console.log("b = ",b[1] )
console.log("c = ",c[1] )
