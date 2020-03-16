var arr = [1,2,3,4,5,6,7,8,9,0];
var res = [];
console.log(arr);
res = arr.map((a,b) =>  a +1 );
console.log(res);
res.sort((a,b) => a-b);
console.log(Math.min(...res));
console.log(res);
const  filter = res.filter((a,b)=>a== 10);
console.log(filter);


