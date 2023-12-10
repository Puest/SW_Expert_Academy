import java.util.Scanner;

class SW_6190 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] num = new int[N];
			for (int i = 0; i < N; i++) {
				num[i] = sc.nextInt();
			}

			int result = -1;
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					int tmp = num[i] * num[j];
					if (tmp > result && Increase(tmp)) {
						result = tmp;
					}
				}
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}

	public static boolean Increase(int number) {
		String str = String.valueOf(number);
		if (number < 10) {
			return true;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > str.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}
}