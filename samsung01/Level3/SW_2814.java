import java.util.Scanner;

class SW_2814 {
	static int N, M;
	static boolean[] visited;
	static int[][] map;
	static int mlen = 0;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N][N];

			for (int i = 0; i < M; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;

				map[x][y] = map[y][x] = 1;
			}

			for (int i = 0; i < N; i++) {
				visited = new boolean[N];
				dfs(i, 1);
			}

			System.out.printf("#%d %d\n", test_case, mlen);
		}
	}

	public static void dfs(int idx, int cnt) {
		visited[idx] = true;

		for (int i = 0; i < N; i++) {
			if (idx == i) {
				continue;
			}
			if (map[idx][i] == 1 && !visited[i]) {
				dfs(i, cnt + 1);
				visited[idx] = false;
			}
		}

		mlen = Math.max(cnt, mlen);
	}
}