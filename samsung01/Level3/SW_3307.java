import java.util.Scanner;

class SW_3307 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] list = new int[N];
			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
			}

			int[] dp = new int[N];
			int result = 0;
			for (int k = 0; k < N; k++) {
				dp[k] = 1;
				for (int i = 0; i < k; i++) {
					if (list[i] < list[k]) {
						dp[k] = Math.max(dp[k], dp[i] + 1);
					}
					result = Math.max(result, dp[k]);
				}
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}