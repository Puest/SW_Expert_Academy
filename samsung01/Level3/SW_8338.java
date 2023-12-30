import java.util.Scanner;

class SW_8338 {
	static int N, result;
	static int[] a;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			result = 0;
			N = sc.nextInt();
			a = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}

			dfs(1, a[0]);

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}

	public static void dfs(int cnt, int sum) {
		if (cnt == N) {
			result = Math.max(result, sum);
			return;
		}

		dfs(cnt + 1, sum + a[cnt]);
		dfs(cnt + 1, sum * a[cnt]);
	}
}