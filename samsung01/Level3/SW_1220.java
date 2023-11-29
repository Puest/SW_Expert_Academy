import java.util.Scanner;

class SW_1220 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			int[][] table = new int[T][T];

			for (int i = 0; i < T; i++) {
				for (int j = 0; j < T; j++) {
					table[i][j] = sc.nextInt();
				}
			}

			int count = 0;
			for (int i = 0; i < T; i++) {
				int magnetic = 0;
				for (int j = 0; j < T; j++) {
					if (table[j][i] == 1) {
						magnetic = 1;
					} else if (table[j][i] == 2) {
						if (magnetic == 1) {
							count++;
						}
						magnetic = 2;
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, count);
		}
		sc.close();
	}
}