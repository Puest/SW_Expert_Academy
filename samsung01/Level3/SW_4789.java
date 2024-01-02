import java.util.Scanner;

class SW_4789 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int sum = 0;
			int result = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) - '0' > 0) {
					if (sum >= i) {
						sum += (str.charAt(i) - '0');
					} else {
						result += (i - sum);
						sum = i + (str.charAt(i) - '0');
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}