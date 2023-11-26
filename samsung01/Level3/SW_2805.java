import java.util.Scanner;

class SW_2805 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[][] size = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] str = sc.next().split("");
				for (int j = 0; j < N; j++) {
					size[i][j] = Integer.valueOf(str[j]);
				}
			}

			int sum = 0;
			int start = N / 2;
			int end = N / 2;
			for (int i = 0; i < N; i++) {
				for (int j = start; j <= end; j++) {
					sum += size[i][j];
				}
				if (i < N / 2) {
					start -= 1;
					end += 1;
				} else {
					start += 1;
					end -= 1;
				}
			}

			System.out.printf("#%d %d\n", test_case, sum);
		}
		sc.close();
	}
}