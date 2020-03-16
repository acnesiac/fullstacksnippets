var arr = [1,1,1];
var reduce = arr.filter((value,index ) => value ===1 )
                .map( (value ) => value + 1 )
                .reduce ((previous,current) => previous += current );
console.log(reduce);
var res = [];
res = arr.map((a,b) =>  a +1 );
res.sort((a,b) => a-b);
console.log(Math.min(...res));
console.log(res);
const  filter = res.filter((a,b)=>a== 10);
console.log(filter);


