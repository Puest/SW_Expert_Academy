import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class SW_1225 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			Queue<Integer> que = new LinkedList<>();

			for (int i = 0; i < 8; i++) {
				que.add(sc.nextInt());
			}

			int index = 1;
			while (true) {
				int A = que.poll() - index++;

				if (A <= 0) {
					que.offer(0);
					break;
				}

				if (index == 6) {
					index = 1;
				}

				que.offer(A);
			}

			System.out.printf("#%d ", T);
			for (int i : que) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
		sc.close();
	}
}