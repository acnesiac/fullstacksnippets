var text = "Considering how common illness is, how tremendous the spiritual change that it brings, how astonishing, when the lights of health go down, the undiscovered countries that are then disclosed, what wastes and deserts of the soul a slight attack of influenza brings to view, what precipices and lawns sprinkled with bright flowers a little rise of temperature reveals, what ancient and obdurate oaks are uprooted in us by the act of sickness, how we go down into the pit of death and feel the water of annihilation close above our heads and wake thinking to find ourselves in the presence of the angels and harpers when we have a tooth out and come to the surface in the dentist’s arm-chair and confuse his “Rinse the Mouth rinse the mouth” with the greeting of the Deity stooping from the floor of Heaven to welcome us when we think of this, as we are frequently forced to think of it, it becomes strange indeed that illness has not taken its place with love and battle and jealousy among the prime themes of literature.";
var arrtext = text.split(' ');
var trivialWords = ["a", "and", "of", "are", "the", "to", "in", "it", "with", "but", "so", "at"];
var hash={};
const ordered = {};

for (var i = 0; i < trivialWords.length; i++) {
		hash[trivialWords[i]] = 0;
}

for (var i = 0; i < arrtext.length; i++) {
	if( hash[arrtext[i]] != undefined){
		hash[arrtext[i]] ++;
	}
}

Object.keys(hash).sort().forEach(function(key){ 
	ordered[key] = hash[key];
});
console.log( hash );
console.log( ordered );
