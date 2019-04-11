// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str) {
var strarr = str.split('');
var maxChar  = '';
var max = 0;
var hm = {};

for (var i = 0; i < strarr.length; i++) {
    if (!hm[strarr[i]]){
        hm[strarr[i]] = 1;
    }
    else{
        hm[strarr[i]]++;
    }
}

 for(let c in hm){
    if(hm[c] > max ){
        max = hm[c];
        maxChar = c;
    }    
 }

    return maxChar;
}

console.log(maxChar('abcccccccd'));


module.exports = maxChar;
