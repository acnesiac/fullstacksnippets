package codility;
//
//I am exited to work for a company like Bayer and Monsanto because of  ,
// the work that has been made in bioinformatics, biotecnology have  a
//great impact in the world,  and I am definitely interested on being part of it.

// Im interested on technologies like security webtokens, AWS and lambdas Serverless,
// Those technologies definitely will have and impact on the future I was abble to implement
// a REST API based on nodejs and Dinamodb.
/**
* Given a Text string, return the top 'K' frequent occurring words in ascending order.
* Words must be non-trivial.
* Trivial words are combination of Prepositions (to, at, of, with), Articles (the, a, an) and Conjunctions (and, but, so)
*/
import java.io.*;
import java.util.*;
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
	public static void main(String[] args) {

		String text = "Considering how common illness is, how tremendous the spiritual change that it brings, how astonishing, when the lights of health go down, the undiscovered countries that are then disclosed, what wastes and deserts of the soul a slight attack of influenza brings to view, what precipices and lawns sprinkled with bright flowers a little rise of temperature reveals, what ancient and obdurate oaks are uprooted in us by the act of sickness, how we go down into the pit of death and feel the water of annihilation close above our heads and wake thinking to find ourselves in the presence of the angels and harpers when we have a tooth out and come to the surface in the dentist’s arm-chair and confuse his “Rinse the Mouth rinse the mouth” with the greeting of the Deity stooping from the floor of Heaven to welcome us when we think of this, as we are frequently forced to think of it, it becomes strange indeed that illness has not taken its place with love and battle and jealousy among the prime themes of literature.";

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Hello, World!");
		strings.add("Welcome to CoderPad.");
//		strings.add("This pad is running Java " + Runtime.version().feature());

		for (String string : strings) {
			System.out.println(string);
		}
	}
}
/*
Your previous JavaScript content is preserved below:

var _ = require('underscore');

function sayHello() {
  console.log('Hello, World');
}

_.times(5, sayHello);


/**
* Given a Text string, return the top 'K' frequent occurring words in ascending order.
* Words must be non-trivial.
* Trivial words are combination of Prepositions (to, at, of, with), Articles (the, a, an) and Conjunctions (and, but, so)
*/

//public class Solution {
//
//	public static void main(String[] args) throws Exception {
//		String text = "Considering how common illness is, how tremendous the spiritual change that it brings, how astonishing, when the lights of health go down, the undiscovered countries that are then disclosed, what wastes and deserts of the soul a slight attack of influenza brings to view, what precipices and lawns sprinkled with bright flowers a little rise of temperature reveals, what ancient and obdurate oaks are uprooted in us by the act of sickness, how we go down into the pit of death and feel the water of annihilation close above our heads and wake thinking to find ourselves in the presence of the angels and harpers when we have a tooth out and come to the surface in the dentist’s arm-chair and confuse his “Rinse the Mouth rinse the mouth” with the greeting of the Deity stooping from the floor of Heaven to welcome us when we think of this, as we are frequently forced to think of it, it becomes strange indeed that illness has not taken its place with love and battle and jealousy among the prime themes of literature.";
//
//		List<String> trivialWords = Arrays.asList("a", "and", "of", "are", "the", "to", "in", "it", "with", "but", "so", "at");
//
//		// UnCommented below line execute test case.
//		//Solution.runTests(text, trivialWords);
//
//	}
//
//
//
//	private List<String> frequentWords(String text, int k, List<String> trivialWords) {
//		// CANDIDATE'S IMPLEMENTATION HERE
//
//
//		return null;
//
//	}

//	public static void runTests(String text, List<String> trivialWords){
//
//		Solution s = new Solution();
//
//		List<String> words = s.frequentWords(text, 8, trivialWords);
//
//		assert Arrays.asList("how", "illness", "that", "think", "us",     "we", "what", "when").equals(words): "Failed test 1" ;
//
//
//		words = s.frequentWords(text, 15, trivialWords);
//		assert Arrays.asList("above", "annihilation", "go", "greeting", "how", "illness", "precipices", "that", "themes", "think", "us", "wastes", "we", "what", "when").equals(words): "Failed test 2";
//
//	}
//

public class CodilityBinarygapMine {

public static void main(String[] args) {
	System.out.print(CodilityBinarygapMine.solution(10400001));
}

public static int solution(int integer) {
	String string = Integer.toBinaryString(integer);
	char[] charArray = "12000003030003".toCharArray();
	int maxlength = 0;
	int counter =0;
	for (int i = 0 ; i < charArray.length ; i++){
		if(charArray[i] == '0'){
			counter++;
		}else{
			counter = 0;
		}
		if(counter > maxlength){
			maxlength = counter;
		}
	}
	return maxlength;
}

}
