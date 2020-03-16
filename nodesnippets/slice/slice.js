var arr = [1,2,3,4,5];
var arr2 = ['a','b','c','d','e'];

var hash = {};

for (let i = 0; i <arr2.length; i++) {
    hash[arr2[i]] = arr[i];
}

console.log(hash);

var values = Object.values(hash);
console.log(values);



