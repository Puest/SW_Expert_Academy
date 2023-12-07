import java.util.Scanner;

class SW_3431 {
	static int N, K, count;
	static int[] A;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();

			int result = 0;
			if (X < L) {
				result = L - X;
			} else if (X > U) {
				result = -1;
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}