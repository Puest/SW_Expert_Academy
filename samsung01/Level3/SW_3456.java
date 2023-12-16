import java.util.Scanner;

class SW_3456 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int result = 0;
			if (a == b && b == c) {
				result = a;
			} else if (a == b) {
				result = c;
			} else if (a == c) {
				result = b;
			} else if (b == c) {
				result = a;
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}