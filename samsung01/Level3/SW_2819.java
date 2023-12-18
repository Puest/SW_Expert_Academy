import java.util.HashSet;
import java.util.Scanner;

class SW_2819 {
	static int[] dx = { 1, -1, 0, 0 };// 동서남북 x방향 값
	static int[] dy = { 0, 0, 1, -1 };// 동서남북 y방향 값
	static int[][] list;
	static HashSet<String> hs;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			hs = new HashSet<>();

			list = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					list[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					dfs(i, j, 0, "" + list[i][j]);
				}
			}
			int result = hs.size();
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}

	public static void dfs(int x, int y, int dpt, String str) {
		if (dpt == 6) {
			hs.add(str);
			return;
		}
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < 4 & ny < 4) {
				dfs(nx, ny, dpt + 1, str + list[nx][ny]);
			}
		}
	}
}