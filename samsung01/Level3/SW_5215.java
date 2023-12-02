import java.util.Scanner;

class SW_5215 {
	static int N, L, sum;
	static int[] kcal, score;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			L = sc.nextInt();

			score = new int[N];
			kcal = new int[N];

			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				kcal[i] = sc.nextInt();
			}

			sum = 0;
			dfs(0, 0, 0);

			System.out.printf("#%d %d\n", T, sum);
		}

		sc.close();
	}

	public static void dfs(int cnt, int smax, int kmax) {
		if (kmax > L) {
			return;
		}

		if (cnt == N) {
			if (smax > sum) {
				sum = smax;
			}
			return;
		}

		dfs(cnt + 1, smax + score[cnt], kmax + kcal[cnt]);
		dfs(cnt + 1, smax, kmax);
	}
}