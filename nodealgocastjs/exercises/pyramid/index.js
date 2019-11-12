// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'

function pyramid(n) {
	var h = 0;
	for (var i = n-1 ; i >= 0; i--) {
		for (var j =  n-1 ; j >= 0; j--) {
			console.log( "#" );				
		}			
		
	}
}

pyramid(3);

module.exports = pyramid;
