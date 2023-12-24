import java.util.Scanner;

class SW_8658 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int min = 1000000;
			int max = 1;

			for (int i = 0; i < 10; i++) {
				String str = sc.next();
				int sum = 0;
				for (int k = 0; k < str.length(); k++) {
					sum += Integer.valueOf(str.charAt(k) - '0');
				}
				min = Math.min(min, sum);
				max = Math.max(max, sum);
			}

			System.out.printf("#%d %d %d\n", test_case, max, min);
		}
		sc.close();
	}
}