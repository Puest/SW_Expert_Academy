import java.util.Scanner;

class SW_12004 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			boolean ToF = false;
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					if (a * b == N) {
						ToF = true;
					}
				}
			}
			if (ToF == true) {
				System.out.printf("#%d %s\n", test_case, "Yes");
			} else {
				System.out.printf("#%d %s\n", test_case, "No");
			}
		}
		sc.close();
	}
}