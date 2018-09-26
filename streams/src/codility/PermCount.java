package codility;
//A zero-indexed array A consisting of N different integers is given. The array contains integers in 
//the range [1..(N + 1)], which means that exactly one element is missing.
//Your goal is to find that missing element.
//Write a function:
//
//class Solution { public int solution(int[] A); }  
//that, given a zero-indexed array A, returns the value of the missing element.
//For example, given array A such that:
//
//A[0] = 2
//A[1] = 3
//A[2] = 1
//A[3] = 5
//the function should return 4, as it is the missing element.

public class PermCount {
	public static void main(String[] args) {
		System.out.println(PermCount.solution(new int[] { 2, 3, 1, 4 }));
	}
	
	public static int solution(int[] A) {
		int counter[] = new int[A.length];
		//values 1 2 3 5
		//i      0 1 2 3
		
		//		 1 1 1 1
		//       0 1 2 3
		for (int i = 0; i < A.length; i++) {
			if(A[i]<1 || A[i] > A.length){
				return 0;
			}
			if(counter[A[i]-1] == 1){
				// has been previously found
				return 0;
			}
			else {
				// mark it as 1, (found)
				counter[ A[i]-1 ]=1;
			}
		}
		return 1;
	}
}
