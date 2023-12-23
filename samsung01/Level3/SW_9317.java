import java.util.Scanner;

class SW_9317 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 알파벳 길이
			String correct = sc.next();
			String wrong = sc.next();

			int count = 0;
			for (int i = 0; i < N; i++) {
				if (correct.charAt(i) == wrong.charAt(i)) {
					count++;
				}
			}

			System.out.printf("#%d %d\n", test_case, count);
		}
		sc.close();
	}
}