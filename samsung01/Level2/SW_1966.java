import java.util.Arrays;
import java.util.Scanner;

class SW_1966 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] list = new int[N];

			for (int i = 0; i < N; i++) {
				list[i] = sc.nextInt();
			}

			Arrays.sort(list);
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}