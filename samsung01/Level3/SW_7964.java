import java.util.Scanner;

class SW_7964 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 부먹 왕국의 도시 수
			int D = sc.nextInt(); // 이동 제한 거리

			// 1~N번의 도시 차원관문 정보(1:O, 0:X)
			int[] door = new int[N];
			for (int i = 0; i < N; i++) {
				door[i] = sc.nextInt();
			}

			int cnt = 0; // 설치할 문
			int broken = 0; // 깨진 문
			for (int i = 0; i < N; i++) {
				if (door[i] == 1) {
					broken = 0;
				} else {
					broken += 1;
					if (broken == D) {
						cnt++;
						broken = 0;
					}
				}

			}

			System.out.printf("#%d %d\n", test_case, cnt);
		}
		sc.close();
	}
}