import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SW_4466 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			int N = sc.nextInt();
			int K = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				list.add(sc.nextInt());
			}

			Collections.sort(list, Collections.reverseOrder());
			for (int i = 0; i < K; i++) {
				result += list.get(i);
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}