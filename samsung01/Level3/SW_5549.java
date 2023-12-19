import java.util.Scanner;

class SW_5549 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			char[] ch = sc.next().toCharArray();
			if ((ch[ch.length - 1] - '0') % 2 == 0) {
				System.out.printf("#%d %s\n", test_case, "Even");
			} else {
				System.out.printf("#%d %s\n", test_case, "Odd");
			}

		}
		sc.close();
	}
}