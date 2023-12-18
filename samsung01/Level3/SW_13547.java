import java.util.Scanner;

class SW_13547 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			char[] ch = sc.next().toCharArray();
			int cnt = 15 - ch.length;

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == 'o') {
					cnt++;
				}
			}

			if (cnt >= 8) {
				System.out.printf("#%d %s\n", test_case, "YES");
			} else {
				System.out.printf("#%d %s\n", test_case, "NO");
			}

		}
		sc.close();
	}
}