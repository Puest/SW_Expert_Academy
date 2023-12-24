import java.util.Scanner;

class SW_16910 {
	public static void main(String args[]) throws Exception {
		String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			int inner = 0;
			for (int i = -N; i <= N; i++) { // x
				for (int j = -N; j <= N; j++) { // y
					if (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(N, 2)) {
						inner++;
					}
				}
			}

			System.out.printf("#%d %s\n", test_case, inner);
		}
		sc.close();
	}
}