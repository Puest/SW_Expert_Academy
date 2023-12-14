import java.util.Scanner;

class SW_13218 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			int result = N / 3;

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}