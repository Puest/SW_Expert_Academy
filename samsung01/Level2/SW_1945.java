import java.util.Scanner;

class SW_1945 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] list = { 2, 3, 5, 7, 11 };
			int[] count = new int[5];

			for (int i = 0; i < list.length; i++) {
				while (N % list[i] == 0) {
					count[i]++;
					N /= list[i];
				}
			}

			System.out.print("#" + test_case + " ");
			for (int i : count) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
		sc.close();
	}
}