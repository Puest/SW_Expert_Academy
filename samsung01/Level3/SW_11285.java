import java.util.Scanner;

class SW_11285 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		double[] bradius = { Math.pow(20, 2), Math.pow(40, 2), Math.pow(60, 2), Math.pow(80, 2), Math.pow(100, 2),
				Math.pow(120, 2), Math.pow(140, 2), Math.pow(160, 2), Math.pow(180, 2), Math.pow(200, 2) };

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 화살 개수
			int score = 0;
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				// 반지름
				double radius = Math.pow(x, 2) + Math.pow(y, 2);
				for (int j = 0; j < bradius.length; j++) {
					if (radius <= bradius[j]) {
						score += 10 - j;
						break;
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, score);
		}
		sc.close();
	}
}