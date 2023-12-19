import java.util.Scanner;

class SW_6692 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			double perc = 0;
			for (int i = 0; i < N; i++) {
				double p1 = sc.nextDouble();
				int p2 = sc.nextInt();
				perc += p1 * p2;
			}

			System.out.printf("#%d ", test_case);
			System.out.printf("%.6f\n", perc);
		}
		sc.close();
	}
}