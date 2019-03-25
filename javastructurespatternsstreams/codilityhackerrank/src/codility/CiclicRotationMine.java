package codility;

public class CiclicRotationMine {
	//	A zero-indexed array A consisting of N integers is given. 
	//  Rotation of the array means that each element is shifted right by one index,
	//  and the last element of the array is also moved to the first place.
	public static void main(String[] args) {
			int [] a = new int[]{1,2,4,5};
				System.out.println(new CiclicRotationMine().solution(a, 2).toString());

	}
	
	public  int [] solution(int [] A, int K)
	{



			for (int j  =0 ; j < K ; j ++){

				rotate(A);
			}
			return A;
	}
	
	public void rotate(int A[]){
		int temp = A[0];
		for (int i= 0; i< A.length -1; i++){
			A[i]= A[i + 1] ;
		}
		A[A.length-1] = temp;

	}
}