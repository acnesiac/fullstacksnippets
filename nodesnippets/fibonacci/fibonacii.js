var fibo = function(a){
    if (a <= 1) return 1;
    return fibo (a - 1) + fibo (a - 2);
}

console.log(fibo(10));
