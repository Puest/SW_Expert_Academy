import java.util.Scanner;

class SW_3750 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			char[] n = str.toCharArray();
			while (true) {
				if (n.length == 1) {
					System.out.printf("#%d %s\n", test_case, str);
					break;
				}

				long sum = 0;
				for (int i = 0; i < n.length; i++) {
					sum += n[i] - '0';
				}

				str = String.valueOf(sum);
				n = String.valueOf(sum).toCharArray();
			}

		}
		sc.close();
	}
}