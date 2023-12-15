import java.util.Scanner;

class SW_15612 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 'O' = 8
		// 'O' 같은 행, 열 X
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			char[][] ch = new char[8][8];

			for (int i = 0; i < 8; i++) {
				char[] c = sc.next().toCharArray();
				for (int j = 0; j < 8; j++) {
					ch[i][j] = c[j];
				}
			}
			boolean[] row = new boolean[8]; // 행
			boolean[] col = new boolean[8]; // 열
			String result = "yes";
			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (ch[i][j] == 'O') {
						if (row[i] == false && col[j] == false) {
							row[i] = true;
							col[j] = true;
							cnt += 1;
						} else {
							result = "no";
						}
					}

				}
			}

			if (cnt != 8) {
				result = "no";
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}