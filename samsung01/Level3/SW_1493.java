import java.util.Scanner;

class SW_1493 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int p = sc.nextInt();
			int q = sc.nextInt();

			// &(p)
			int sumA = 0;
			int xA = 0;
			int yA = 0;
			for (int i = 1;; i++) {
				sumA += i;
				if (sumA >= p) {
					xA = i - (sumA - p);
					yA = (i + 1) - xA;
					break;
				}
			}

			// &(q)
			int sumB = 0;
			int xB = 0;
			int yB = 0;
			for (int i = 1;; i++) {
				sumB += i;
				if (sumB >= q) {
					xB = i - (sumB - q);
					yB = (i + 1) - xB;
					break;
				}
			}

			// &(p) ★ &(q)
			int xC = xA + xB;
			int yC = yA + yB;
			int sumC = 1;
			int result = 0;
			// y값 구하기
			for (int i = 1; i < (xC + yC) - 1; i++) {
				sumC += i;
			}
			// y값의 x값을 더하여 결과값
			result = sumC + (xC - 1);

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}