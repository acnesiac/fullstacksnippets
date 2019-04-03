console.log('hello');
// 1) sort
var arr = [1,2,3,4,5,6];

arr.sort(function (a,b) {
    return a-b;
});

console.log(arr[arr.length-1]);

//2)
var text = "Hola mundo cruel y lleno de esparanza Hola";
var textarr = text.split(' ');
console.log(textarr);
var hm = {};
for(var i= 0 ; i < textarr.length ; i ++){
    if (hm[textarr[i]] === undefined){
        hm[textarr[i]] = 1;
    }
    else{
        hm[textarr[i]]++;
    }
}

console.log(hm);









