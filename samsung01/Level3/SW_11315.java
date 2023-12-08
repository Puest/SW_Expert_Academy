import java.util.Scanner;

class SW_11315 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] dl = { -1, -1, 0, 1, 1, 1, 0, -1 }; // ↑,↗,→,↘,↓,↙,←,↖(선)
		int[] da = { 0, 1, 1, 1, 0, -1, -1, -1 }; // ↑,↗,→,↘,↓,↙,←,↖(각도)

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			char[][] list = new char[N][N];
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					list[i][j] = str.charAt(j);
				}
			}

			boolean winner = false;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (list[i][j] == 'o') {
						for (int x = 0; x < 8; x++) {
							for (int cnt = 1; cnt < 5; cnt++) {
								int nl = i + dl[x] * cnt;
								int na = j + da[x] * cnt;

								if (nl < 0 || na < 0 || nl >= N || na >= N) {
									break;
								} else if (list[nl][na] != 'o') {
									break;
								}
								if (cnt == 4)
									winner = true;
							}

						}
					}

				}
			}

			if (winner) {
				System.out.printf("#%d %s\n", test_case, "YES");
			} else {
				System.out.printf("#%d %s\n", test_case, "NO");
			}
		}
	}
}