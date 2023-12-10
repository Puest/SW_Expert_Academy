import java.util.Scanner;

class SW_4406 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next().replaceAll("[a|e|i|o|u]", "");

			System.out.printf("#%d %s\n", test_case, str);
		}
		sc.close();
	}
}