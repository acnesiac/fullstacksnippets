package codility;
public class StandarDeviation {
	public static int solution(int[] A) {
		int N = A.length;

		if (N == 0)
			return -1;

		double M = 0;
		for (int i = 0; i < N; i++) {
			M += A[i];
		}
		M = M / N;
//		System.out.println(M);

		double maxDev = 0;
		int extremeEle = 0;

		for (int i = 0; i < N; i++) {
			double dev = Math.abs(A[i] - M);
//			System.out.println(dev);
			if (dev > maxDev) {
				maxDev = dev;
				extremeEle = i;
			}
		}
		return extremeEle;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 9, 4, -3, -10 };
		System.out.println(StandarDeviation.solution(A));
	}

}