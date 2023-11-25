import java.util.Scanner;

class SW_2029 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int mok = A / B;
			int na = A % B;
			System.out.println("#" + test_case + " " + mok + " " + na);
		}
	}
}