import java.util.Scanner;

class SW_5789 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] box = new int[N];
			for (int i = 1; i <= Q; i++) {
				int L = sc.nextInt();
				int R = sc.nextInt();
				for (int j = L - 1; j < R; j++) {
					box[j] = i;
				}
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < N; i++) {
				System.out.printf("%s ", box[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}