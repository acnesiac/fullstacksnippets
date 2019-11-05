package codility;


public class Binarygap {

public static void main(String[] args) {
	System.out.print(Binarygap.solution(10400001));
}

public static int solution(int integer) {
	String string = Integer.toBinaryString(integer);
	char[] charArray = "12000003030003".toCharArray();
	int maxlength =0;
	int counter =0;
	for (int i = 0; i < charArray.length; i++) {
		if (charArray[i]=='0') {
			counter++;
		}else{
			counter =0;
		}
		if(counter > maxlength){
			maxlength = counter;			
		}
	}
	return maxlength;
}

}
