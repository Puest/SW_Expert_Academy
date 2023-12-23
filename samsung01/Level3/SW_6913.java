import java.util.Scanner;

class SW_6913 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 사람 수
			int M = sc.nextInt(); // 문제 수

			int[] problem = new int[N];
			int cnt = 0;
			int max = 0;
			for (int i = 0; i < N; i++) {
				int score = 0;
				for (int j = 0; j < M; j++) {
					score += sc.nextInt();
				}
				max = Math.max(score, max);
				problem[i] = score;
			}

			for (int i = 0; i < N; i++) {
				if (problem[i] == max) {
					cnt++;
				}
			}

			System.out.printf("#%d %d %d\n", test_case, cnt, max);
		}
		sc.close();
	}
}