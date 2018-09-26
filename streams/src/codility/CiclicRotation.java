package codility;

public class CiclicRotation {
	//	A zero-indexed array A consisting of N integers is given. 
	//  Rotation of the array means that each element is shifted right by one index,
	//  and the last element of the array is also moved to the first place.
	public static void main(String[] args) {
		int[] solution = CiclicRotation.solution2(new int[] {3, 8, 9, 7, 6 }, 2);
		for (int i = 0; i < solution.length; i++) {
			int j = solution[i];
			System.out.print(j);
		}
	}
	
	public static int [] solution(int [] A, int K) 
	{
	    int N = A.length;
	    if (N==0)
	        return A;
	    if (K>=N)
	        K %= N;
	    if (K==0)
	        return A;
	    int [] rotA = new  int [N];
 	    for (int i=0; i<N; i++)
	        rotA[i] = (i<K) ? A[N+i-K] : A[i-K];
	    return rotA;
	}
	
	public static int[] solution2(int A[], int k){
		int res[]  = new int[A.length];
		// values  3 8 9 7 6
		// indices 0 1 2 3 4
		
		
		for (int i = 0 ; i < A.length ; i ++){
			
			
			if( i < k){
				res[i] = A[A.length + i -k ];
			}
			else{
				res[i] = A[ i- k]; 
			}
			
		}
		
		return res;
	}
}