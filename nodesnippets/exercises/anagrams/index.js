// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

function anagrams(stringA, stringB) {

    return cleanStr(stringA) === cleanStr(stringB)

    // var objA = objFactory(stringA);
    // var objB = objFactory(stringB);

    // if(Object.keys(objA).length !== Object.keys(objB).length){
    //     return false
    // }

    // for(let c in objA){
    //     if(objA[c] !== objB[c]){
    //         return false
    //     }
    // }

    // return true;
}

const cleanStr = (str) => {
    return str.replace(/[^\w]/g, "").toLowerCase().split("").sort().join("");
}

// const objFactory = (str) =>{
//     var obj = {};;

//     for(let c of str.replace(/[^\w]/g, "").toLowerCase()){
//         obj[c] = obj[c] +1 || 1;
//     }

//     return obj;
// }

module.exports = anagrams;
