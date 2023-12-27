import java.util.Scanner;

class SW_9480 {
	static int N, result;
	static boolean[][] arr;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // 알고 있는 단어 개수(총 26개)
			result = 0;

			arr = new boolean[N][26];
			for (int i = 0; i < N; i++) {
				char[] ch = sc.next().toCharArray();
				for (int j = 0; j < ch.length; j++) {
					arr[i][ch[j] - 'a'] = true;
				}
			}

			dfs(0, new int[26]);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}

	static void dfs(int depth, int[] check) {
		if (depth == N) {
			int Alpha = 0;
			for (int i = 0; i < check.length; i++) {
				if (check[i] >= 1) {
					Alpha++;
				}
			}
			if (Alpha == 26) {
				result++;
			}
			return;
		}

		for (int i = 0; i < arr[depth].length; i++) {
			if (arr[depth][i]) {
				check[i]++;
			}
		}
		dfs(depth + 1, check);

		for (int i = 0; i < arr[depth].length; i++) {
			if (arr[depth][i]) {
				check[i]--;
			}
		}
		dfs(depth + 1, check);
	}
}