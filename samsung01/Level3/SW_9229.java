import java.util.Scanner;

class SW_9229 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[] kg = new int[N];
			for (int i = 0; i < N; i++) {
				kg[i] = sc.nextInt();
			}

			int max = 0;

			for (int i = 0; i < N; i++) {
				for (int k = i + 1; k < N; k++) {
					int sum = kg[i] + kg[k];
					if (sum <= M && sum > max) {
						max = sum;
					}
				}
			}
			if (max == 0)
				max = -1;
			System.out.printf("#%d %d\n", test_case, max);
		}
		sc.close();
	}
}