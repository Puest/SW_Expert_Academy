import java.util.Scanner;

class SW_14178 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int D = sc.nextInt();

			int result = 0;
			int sprayer = D * 2 + 1;
			if (N % sprayer != 0) {
				result = N / sprayer + 1;
			} else {
				result = N / sprayer;
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}