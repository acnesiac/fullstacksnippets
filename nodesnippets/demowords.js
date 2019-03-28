console.log('hello');

var demo = "hola 123 dormida haciendote la cama  para el cielo cielo ya es dificil que tu la olvides la esperanza";

var arr= demo.split(' ');
var hash = {};
hash["hola"] = 0;
hash["cielo"] = 0;

for (var i= 0 ; i < arr.length; i ++){ 
		console.log(hash[arr[i]]);
		if (hash[arr[i]] != undefined){
				hash[arr[i]] ++;
		}
}


console.log(hash);
