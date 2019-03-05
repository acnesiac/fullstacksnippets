package codility;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.print(PrimeNumbers.primes(new int[]{1,2,3,4,5}));
	}
	private static int[] primes(int[] N) {
		int counter[] = new int[N.length];
		for (int i = 0; i < N.length; i++) {
			if ( (N[i]%0==0) && ( N[i] % N[i] ==0) ){
				counter[i] = N[i];
			}
		}
		return counter;
	}
}
