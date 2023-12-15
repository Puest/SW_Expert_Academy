import java.util.Scanner;

class SW_15230 {
	public static void main(String args[]) throws Exception {
		String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String[] s = sc.next().split("");

			int count = 0;
			for (int i = 0; i < s.length; i++) {
				if (str[i].equals(s[i])) {
					count++;
				} else {
					break;
				}
			}

			System.out.printf("#%d %d\n", test_case, count);
		}
		sc.close();
	}
}