import java.util.Scanner;

class SW_7102 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 1~N번 카드(1장)
			int M = sc.nextInt(); // 1~M번카드(1장)
			int[] list = new int[N + M + 1];

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					list[i + j]++;
				}
			}
			int max = 0;
			for (int i = 0; i < list.length; i++) {
				max = Math.max(max, list[i]);
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < list.length; i++) {
				if (list[i] == max) {
					System.out.printf("%d ", i);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}