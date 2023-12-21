import java.util.Scanner;

class SW_3282 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 물건의 개수 4
			int K = sc.nextInt(); // 가방 부피 5

			int[] V = new int[N + 1]; // 부피
			int[] C = new int[N + 1]; // 가치

			for (int i = 1; i <= N; i++) {
				V[i] = sc.nextInt();
				C[i] = sc.nextInt();
			}

			int[][] dp = new int[N + 1][K + 1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= K; j++) {
					if (V[i] > j) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.max(dp[i - 1][j - V[i]] + C[i], dp[i - 1][j]);
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, dp[N][K]);
		}
		sc.close();
	}
}