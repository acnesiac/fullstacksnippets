//Hit compile and run to see a sample output.
//Read values from stdin, do NOT hard code input.

process.stdin.resume();
process.stdin.setEncoding("ascii");
var input = "";
var res = [];
 var duplicates;
 var arr;
process.stdin.on("data", function (chunk) {
    input += chunk;
    arr = input.split('');
   
    for(var i  = 0 ; i < arr.length ; i ++){
        if(res[arr[i]] === undefined){
           res[arr[i]] = 1;  
          
        }else{
            duplicates = true;
            res[arr[i]] += res[arr[i]];
        }
    }
    
});
process.stdin.on("end", function () {
    var values =Object.keys(res);
    values.sort(function(a,b){return a>b;});
    //console.log(resf);
    if(duplicates){
        for (var v = 0 ; v < values.length ; v ++){
            if(values[v] ==' ') continue;
            if(res [values[v]] <= 1) continue;
            console.log ( "'" + values[v].toLowerCase() + "'" +" " +res [values[v]]);
        }
    }
    else{
        console.log("NONE");
    }
});
