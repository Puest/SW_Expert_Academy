import java.util.Scanner;

class SW_1217 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();

			int N = sc.nextInt();
			int M = sc.nextInt();

			int result = (int) Math.pow(N, M);

			System.out.printf("#%d %d\n", T, result);
		}
		sc.close();
	}
}