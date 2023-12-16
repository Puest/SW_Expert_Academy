import java.util.Scanner;

class SW_10505 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int aver = 0;
			int[] list = new int[N];
			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
				aver += list[i];
			}
			aver /= N;

			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (aver >= list[i]) {
					cnt++;
				}
			}

			System.out.printf("#%d %s\n", test_case, cnt);
		}
		sc.close();
	}
}