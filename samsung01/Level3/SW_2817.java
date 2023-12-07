import java.util.Scanner;

class SW_2817 {
	static int N, K, count;
	static int[] A;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();

			A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			count = 0;
			dfs(0, 0);

			System.out.printf("#%d %d\n", test_case, count);
		}
		sc.close();
	}

	public static void dfs(int cnt, int sum) {
		if (cnt == N) {
			if (sum == K) {
				count++;
			}
			return;
		}
		dfs(cnt + 1, sum + A[cnt]);
		dfs(cnt + 1, sum);
	}
}