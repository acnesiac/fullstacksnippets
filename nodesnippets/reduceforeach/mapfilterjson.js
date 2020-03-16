var arr = [1,2,3,4,5,6,7,8,9,0,1,2,3,2,1];
console.log(arr);

const res = arr.filter((a,b) => a == 1 )
            .map((a,index) => (a * 15 ))
            .reduce((acum, current) => (acum+=current) );
            
console.log(res);



