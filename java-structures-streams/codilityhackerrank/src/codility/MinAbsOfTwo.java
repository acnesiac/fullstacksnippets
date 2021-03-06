package codility;
import java.util.Arrays;

class MinAbsOfTwo {
    
	  static public int solution(int[] A) {
	        // write your code in Java SE 8
	        // the original version is at
		        // http://codesays.com/2014/solution-to-min-abs-sum-of-two-by-codility/
	        int N = A.length;
	        Arrays.sort(A);
	        int tail = 0;
	        int head = N - 1;
	        int minAbsSum = Math.abs(A[tail] + A[head]);
	        while (tail <= head) {
	            int currentSum = A[tail] + A[head];
	            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
	            // it's very clever to compare to 0 because if the sum has become
	            // positive, we should know that the head can be moved left
	            if (currentSum <= 0)
	                tail++;
	            else
	                head--;
	        }
	        return minAbsSum;
	    }
	
	public static void main(String[] args) {
		int[] A = new int[] { 1, 4, 7, 3, 3, 5 };
		System.out.println(MinAbsOfTwo.solution(A));
	}
}