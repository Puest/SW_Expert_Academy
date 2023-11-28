import java.util.Scanner;

class SW_1215 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 1; test_case++) {
			int N = sc.nextInt();

			char[][] board = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					board[i][j] = str.charAt(j);
				}
			}

			int count = 0;
			boolean cor = true;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j <= board.length - N; j++) {
					// 가로
					cor = true;
					for (int k = 0; k < N / 2; k++) {
						if (board[i][j + k] != board[i][j - k + N - 1]) {
							cor = false;
							break;
						}
					}
					if (cor) {
						count++;
					}

					// 세로
					cor = true;
					for (int k = 0; k < N / 2; k++) {
						if (board[j + k][i] != board[j - k + N - 1][i]) {
							cor = false;
						}
					}
					if (cor) {
						count++;
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, count);
		}
		sc.close();
	}
}