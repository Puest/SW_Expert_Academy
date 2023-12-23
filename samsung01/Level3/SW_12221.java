import java.util.Scanner;

class SW_12221 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int result = 0;
			if (A < 10 && B < 10) {
				result = A * B;
			} else {
				result = -1;
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}