var arr = [1,2,3,4,5,6,7,8,9,0,1,2,3,2,1];

const res = arr
            .filter((a,b) => a == 1 )
            .map((a,index) => (a * 16 ))
            .reduce((acum, current) => (acum+=current) );

let res2 = arr.forEach( (value ) =>   {let sum; return sum += value}  );

console.log(res2);


var res3  = arr.map((value,index)=>{
    var i = 10;
    value * i;
    return value * i;
});

res3.forEach((value)=> console.log(value));









