import java.util.Scanner;

class SW_14692 {
	public static void main(String args[]) throws Exception {
		String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String result = "Alice";
			if (N % 2 == 1) {
				result = "Bob";
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}