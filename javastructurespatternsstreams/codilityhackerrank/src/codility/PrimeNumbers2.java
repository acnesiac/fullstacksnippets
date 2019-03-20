package codility;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class PrimeNumbers2 {

	public static void main(String args[]) {
		int s1 = 0, s2 = 0; 
		System.out.println(PrimeNumbers2.solution(s1, s2));
	}

	public static int solution(int A, int B) {
		boolean flag = false;
		int primes = 0;
		for (int i = A; i <= B; i++) {
			if (isPrime(i) == true) {
				primes++;
//				System.out.println(i);
			}
		}
		return primes;
	}
	
	public static boolean isPrime(int num){
		boolean flag = false;
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}
}