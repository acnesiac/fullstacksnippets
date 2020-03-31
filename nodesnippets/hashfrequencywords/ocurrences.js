let arr1 = [1,2,3,4,5,12,8,1,4,2,5,6,7];
let arr2 = [0,2,0,0,0,0,0,0,0,0,0,5,0,0,1,0,0,0,0,0,7];

var res = arr1.reduce((acumulator , current)=>(
    acumulator += current
));

var res2 = arr1.sort((a,b)=>(b-a));


function find(arr2) {
    let max = 0;
    let counter  = 0;
    for (let i = 0; i< arr2.length ; i++){
        if (counter > max){
            max = counter;
        }
        if(arr2[i] === 0){
            counter ++;
        }else {
            counter =0;
        }
    }
    return max;
}

console.log(find(arr2));
