function maxmine(){
	var arr = [3,122,5,345,7,9];
	var i = 0;
	var res = [];
	var slice = 2;
	var min = Math.min.apply(null,arr);
	while(i < arr.length){
		var slicedarr= arr.slice(i,i+slice);
		res.push(slicedarr);
		i += slice;
	 	var minmax = Math.max.apply(null,slicedarr) - Math.min.apply(null,slicedarr);
	 	//console.log(minmax);
	 	if(minmax < min){
	 		min = minmax;
	 	}
	}
	console.log(min);
}
maxmine();
module.exports = maxmine;