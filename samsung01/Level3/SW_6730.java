import java.util.Scanner;

class SW_6730 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] list = new int[N];
			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
			}

			int high = 0;
			int low = 0;
			for (int i = 0; i < N - 1; i++) {
				if (list[i] < list[i + 1]) {
					int sum = Math.abs(list[i + 1] - list[i]);
					high = Math.max(high, sum);
				} else if (list[i] > list[i + 1]) {
					int sum = Math.abs(list[i + 1] - list[i]);
					low = Math.max(low, sum);
				}
			}

			System.out.printf("#%d %d %d\n", test_case, high, low);
		}
		sc.close();
	}
}