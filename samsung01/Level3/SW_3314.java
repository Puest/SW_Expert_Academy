import java.util.Scanner;

class SW_3314 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			for (int i = 0; i < 5; i++) {
				int score = sc.nextInt();
				if (score < 40) {
					score = 40;
				}
				result += score;
			}

			System.out.printf("#%d %d\n", test_case, result / 5);
		}
		sc.close();
	}
}