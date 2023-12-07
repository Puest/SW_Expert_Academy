import java.util.Arrays;
import java.util.Scanner;

class SW_1860 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			int[] PerTime = new int[N];
			for (int i = 0; i < N; i++) {
				PerTime[i] = sc.nextInt();
			}
			Arrays.sort(PerTime);

			int fish = 0;

			String result = "Possible";
			for (int i = 0; i < N; i++) {
				fish = (PerTime[i] / M) * K;
				if (fish - 1 - i < 0) {
					result = "Impossible";
					break;
				}
			}

			System.out.printf("#%d %s\n", test_case, result);

		}
		sc.close();
	}
}