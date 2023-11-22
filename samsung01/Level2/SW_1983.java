import java.util.Arrays;
import java.util.Scanner;

class SW_1983 {
	public static void main(String args[]) throws Exception {
		String[] str = { "D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // N명
			int K = sc.nextInt(); // K번째 학생의 점수

			double score[] = new double[N];
			double result = 0;
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				score[i] = x * 0.35 + y * 0.45 + z * 0.2;
				if (i + 1 == K) {
					result = score[i];
				}
			}
			Arrays.sort(score);
			int index = 0;

			for (int i = 0; i < N; i++) {
				if (score[i] == result) {
					index = i;
				}
			}

			index = index / (N / 10);
			System.out.println("#" + test_case + " " + str[index]);
		}
		sc.close();
	}
}