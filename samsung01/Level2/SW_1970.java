import java.util.Scanner;

class SW_1970 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			int[] list = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
			int[] count = new int[8];
			for (int i = 0; i < list.length; i++) {
				if (list[i] <= N) {
					count[i] = N / list[i];
					N %= list[i];
				}
			}

			System.out.println("#" + test_case);
			for (int i : count) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}