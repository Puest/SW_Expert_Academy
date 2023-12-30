import java.util.Scanner;

class SW_14555 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();

			int count = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == '(') {
					if (str.charAt(i + 1) == ')') {
						count++;
					} else if (str.charAt(i + 1) == '|') {
						count++;
					}
				} else if (str.charAt(i) == '|') {
					if (str.charAt(i + 1) == ')') {
						count++;
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, count);
		}
		sc.close();
	}
}