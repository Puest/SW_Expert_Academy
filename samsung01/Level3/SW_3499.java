import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class SW_3499 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String[] str = new String[N];
			for (int i = 0; i < N; i++) {
				str[i] = sc.next();
			}

			Queue<String> que1 = new LinkedList<String>();
			Queue<String> que2 = new LinkedList<String>();

			int len = 0;
			if (N % 2 == 0) {
				len = N / 2;
			} else {
				len = N / 2 + 1;
			}

			for (int i = 0; i < len; i++) {
				que1.add(str[i]);
			}
			for (int i = len; i < N; i++) {
				que2.add(str[i]);
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < N; i++) {
				while (!que1.isEmpty()) {
					System.out.print(que1.poll() + " ");
					break;
				}
				while (!que2.isEmpty()) {
					System.out.print(que2.poll() + " ");
					break;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}