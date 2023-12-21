import java.util.Scanner;

class SW_5688 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			long N = sc.nextLong();
			long result = -1;
			long i = 1;
			while (i * i * i <= N) {
				if (i * i * i == N) {
					result = i;
					break;
				}
				i++;
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}