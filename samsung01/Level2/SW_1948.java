import java.util.Scanner;

class SW_1948 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[] d = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int test_case = 1; test_case <= T; test_case++) {
			int m1 = sc.nextInt() - 1;
			int d1 = sc.nextInt();
			int m2 = sc.nextInt() - 1;
			int d2 = sc.nextInt();

			int msum1 = 0;
			for (int i = 0; i < m1; i++) {
				msum1 += d[i];
			}
			msum1 += d1;

			int msum2 = 0;

			for (int i = 0; i < m2; i++) {
				msum2 += d[i];
			}
			msum2 += d2;

			int days = msum2 - msum1 + 1;

			System.out.println("#" + test_case + " " + days);
		}
		sc.close();
	}
}