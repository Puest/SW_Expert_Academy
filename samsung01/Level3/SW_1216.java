import java.util.Scanner;

class SW_1216 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();

			String[][] list = new String[100][100];
			for (int i = 0; i < 100; i++) {
				String[] str = sc.next().split("");
				for (int j = 0; j < 100; j++) {
					list[i][j] = str[j];
				}
			}

			int mlen = 0;
			boolean cor = true;
			for (int i = 0; i <= 100; i++) {
				for (int j = 0; j < 100; j++) {
					for (int x = 0; x <= 100 - i; x++) {
						// 가로
						cor = true;
						for (int y = 0; y < i / 2; y++) {
							if (!list[j][x + y].equals(list[j][x + i - y - 1])) {
								cor = false;
								break;
							}
						}
						if (cor) {
							if (mlen < i) {
								mlen = i;
							}
						}

						// 세로
						cor = true;
						for (int y = 0; y < i / 2; y++) {
							if (!list[x + y][j].equals(list[x + i - y - 1][j])) {
								cor = false;
								break;
							}
						}
						if (cor) {
							if (mlen < i) {
								mlen = i;
							}
						}
					} // for(x)
				} // for(j)
			} // for(i)

			System.out.printf("#%d %d\n", T, mlen);
		}
		sc.close();
	}
}