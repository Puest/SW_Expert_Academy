import java.util.Scanner;

class SW_7272 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String N = sc.next();
			String M = sc.next();
			String result = "DIFF";

			N = replace(N);
			M = replace(M);

			if (N.equals(M)) {
				result = "SAME";
			} else {
				result = "DIFF";
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}

	public static String replace(String text) {
		text = text.replaceAll("[A|D|O|P|Q|R]", "1");
		text = text.replaceAll("[B]", "2");
		text = text.replaceAll("[^12]", "3");

		return text;
	}
}