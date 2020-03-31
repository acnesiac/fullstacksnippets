package codility;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
	public static void main(String[] args) {
		System.out.println( AbsDistinct.solution(new int[]{ 1, 2, 3, 4, 5, -4 })
		);
	}
	static int solution(int [] A){
		Set set =  new HashSet();
		for (int  i  = 0 ; i < A.length ; i ++){
			set.add(Math.abs(i));
		}
		return set.size();	
	}
}
