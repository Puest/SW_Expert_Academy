import java.util.Arrays;
import java.util.Scanner;

class SW_1208 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int dump = sc.nextInt();
			int[] list = new int[100];

			for (int i = 0; i < list.length; i++) {
				list[i] = sc.nextInt();
			}
			Arrays.sort(list);

			for (int i = 0; i < dump; i++) {
				list[list.length - 1] = list[list.length - 1] - 1;
				list[0] = list[0] + 1;

				Arrays.sort(list);
			}

			int max = list[list.length - 1];
			int min = list[0];

			System.out.printf("#%d %d\n", test_case, max - min);
		}
		sc.close();
	}
}