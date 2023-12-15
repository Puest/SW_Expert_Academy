import java.util.Scanner;

class SW_12368 {
	public static void main(String args[]) throws Exception {
		String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int result = A + B;
			if (result >= 24) {
				result %= 24;
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}