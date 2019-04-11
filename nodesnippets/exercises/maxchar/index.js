// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str) {

    const chars = {};
    var max = 0;
    var maxChar = '';


    for(let c of str){
        if(!chars[c]){
            chars[c] = 1;
        }else{
            chars[c]++;
        }

        //Another way to check the condition

        //chars[c] = !chars[c] + 1 || 1;

        for(let c in chars){
            if(chars[c] > max){
                max = chars[c];
                maxChar = c;
            }
        }
    }

    return maxChar;
}

module.exports = maxChar;
