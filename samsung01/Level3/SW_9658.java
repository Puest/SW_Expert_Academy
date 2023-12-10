import java.util.Scanner;

class SW_9658 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			char[] ch = String.valueOf(sc.next()).toCharArray();

			if (ch[2] - '0' < 5) {
				System.out.printf("#%d %c.%c*10^%d\n", test_case, ch[0], ch[1], ch.length - 1);
			} else if (ch[2] - '0' >= 5 && ch[1] - '0' < 9) {
				System.out.printf("#%d %c.%c*10^%d\n", test_case, ch[0], ch[1] + 1, ch.length - 1);
			} else if (ch[2] - '0' >= 5 && ch[1] - '0' == 9) {
				if (ch[0] - '0' < 9) {
					System.out.printf("#%d %c.0*10^%d\n", test_case, ch[0] + 1, ch.length - 1);
				} else {
					System.out.printf("#%d 1.0*10^%d\n", test_case, ch.length);
				}
			}
		}
		sc.close();
	}
}