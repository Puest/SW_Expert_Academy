import java.util.LinkedList;
import java.util.Scanner;

class SW_3408 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			long s1 = (N * (N + 1)) / 2; // 연속
			long s2 = (N * (N + 1)) - N; // 홀수
			long s3 = N * (N + 1); // 짝수

			System.out.printf("#%d %d %d %d\n", test_case, s1, s2, s3);
		}
		sc.close();
	}
}