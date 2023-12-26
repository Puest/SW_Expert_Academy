import java.util.Scanner;

class SW_8104 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int grps = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					grps += i * K;
				} else {
					grps += ((i - 1) * K) + 1;
				}
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < K; i++) {
				if (N % 2 == 0) {
					System.out.printf("%d ", grps);
				} else {
					System.out.printf("%d ", grps + i);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}