import java.util.ArrayList;
import java.util.Scanner;

class SW_5431 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 수강생 수
			int K = sc.nextInt(); // 제출한 수

			ArrayList list = new ArrayList<>();
			for (int i = 1; i <= N; i++) {
				list.add(i);
			}

			// 제출한 번호
			int[] num = new int[K];
			for (int i = 0; i < K; i++) {
				num[i] = sc.nextInt();
				list.remove(new Integer(num[i]));
			}

			System.out.printf("#%d ", test_case, list);
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d ", list.get(i));
			}
			System.out.println();

		}
		sc.close();
	}
}