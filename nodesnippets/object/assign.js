
var testme = {
    a:1,
    b:2
};

Object.assign(testme, {a:3});
var keys = Object.keys(testme);

console.log(testme);
console.log(keys);
