import java.util.LinkedList;
import java.util.Scanner;

class SW_9280 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 0; // 결과
			int n = sc.nextInt(); // n 줄
			int m = sc.nextInt(); // m 번
			int[] R = new int[n]; // 단위 무게당 요금
			int[] park = new int[n]; // 주차장 자리
			int[] W = new int[m]; // 차량의 무게
			LinkedList<Integer> move = new LinkedList<>(); // 움직임 저장
			LinkedList<Integer> wait = new LinkedList<>(); // 대기열

			for (int i = 0; i < n; i++) {
				R[i] = sc.nextInt();
			}

			for (int i = 0; i < m; i++) {
				W[i] = sc.nextInt();
			}

			for (int i = 0; i < m * 2; i++) {
				move.add(sc.nextInt());
			}

			int now = 0;
			int late = 0;
			while (!move.isEmpty()) {
				now = move.poll(); // 3,2,-3,1,4,-4,-2,-1
				if (now > 0) {
					wait.add(now);
					late = wait.peek();
					for (int i = 0; i < n; i++) {
						if (park[i] == 0) {
							park[i] = late;
							result += R[i] * W[late - 1];
							wait.poll();
							break;
						}
					}
				} else {
					now = -now; // 음수 → 양수
					for (int i = 0; i < n; i++) {
						if (park[i] == now) {
							park[i] = 0;
							if (!wait.isEmpty()) {
								now = wait.poll();
								park[i] = now;
								result += R[i] * W[now - 1];
							}
							break;
						}
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}