import java.util.LinkedList;
import java.util.Scanner;

class SW_1228 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			LinkedList<Integer> list = new LinkedList<>();
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				list.add(sc.nextInt());
			}

			int C = sc.nextInt();
			int[] CL = new int[C];
			for (int i = 0; i < C; i++) {
				String str = sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for (int j = 0; j < y; j++) {
					list.add(x, sc.nextInt());
					x++;
				}
			}
			System.out.printf("#%d ", test_case);
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d ", list.poll());
			}
			System.out.println();
		}
		sc.close();
	}
}