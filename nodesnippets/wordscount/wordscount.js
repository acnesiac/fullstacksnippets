var counts = function (){
    var words = ['a','a','b'];
    var hash = {};

    words.forEach( function (key,index){
        if (hash[key] == undefined ){
            hash[key] = 1;
        }else{
            ++hash[key];
        }
    } );
    console.log(hash);
}
counts();

module.exports = counts;
