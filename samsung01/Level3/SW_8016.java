import java.util.Scanner;

class SW_8016 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			long n = sc.nextInt();
			long N = (n - 1) * (n - 1) * 2 + 1; // 왼쪽
			long K = n * n * 2 - 1; // 오른쪽

			System.out.printf("#%d %d %d\n", test_case, N, K);
		}
		sc.close();
	}
}