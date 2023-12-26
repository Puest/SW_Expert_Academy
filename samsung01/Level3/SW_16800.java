import java.util.Scanner;

class SW_16800 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			long N = sc.nextLong();
			long move = N - 1; // N의 최장거리 초기화
			for (long i = 2; i <= Math.sqrt(N); i++) { // 약수(i,j)의 i부분만 계산
				if (N % i == 0 && move > i + N / i - 2) {
					move = i + N / i - 2; // i(i),N/i(j),-2(시작부분(1,1))
				}
			}

			System.out.printf("#%d %d\n", test_case, move);
		}
		sc.close();
	}
}