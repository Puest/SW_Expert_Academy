import java.util.Scanner;

class SW_5601 {
	public static void main(String args[]) throws Exception {
		String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < N; i++) {
				System.out.printf("%d/%d ", 1, N);
			}
			System.out.println();
		}
		sc.close();
	}
}