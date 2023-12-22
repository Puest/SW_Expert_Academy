import java.util.Scanner;
import java.util.Stack;

class SW_8931 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			Stack<Integer> st = new Stack<>();
			int K = sc.nextInt();
			int[] arr = new int[K];
			for (int i = 0; i < K; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < K; i++) {
				if (arr[i] != 0) {
					st.push(arr[i]);
				} else {
					st.pop();
				}
			}

			int sum = 0;
			if (st.isEmpty()) {
				System.out.printf("#%d %d\n", test_case, 0);
			} else {
				int len = st.size();
				for (int i = 0; i < len; i++) {
					sum += st.pop();
				}
				System.out.printf("#%d %d\n", test_case, sum);
			}
		}
		sc.close();
	}
}