import java.util.Scanner;

class SW_1976 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int t = 0;
			int m = 0;
			for (int i = 0; i < 2; i++) {
				t += sc.nextInt();
				m += sc.nextInt();
			}
			if (m >= 60) {
				t += 1;
				m %= 60;
			}

			if (t > 12) {
				if (t % 12 == 0)
					t = 12;
				else
					t %= 12;
			}

			System.out.println("#" + test_case + " " + t + " " + m);
		}
		sc.close();
	}
}