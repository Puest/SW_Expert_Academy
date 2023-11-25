import java.util.Scanner;

class SW_1940 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			// 스피드
			int speed = 0;
			// 거리
			int dist = 0;

			for (int i = 0; i < N; i++) {
				int t = sc.nextInt();

				if (t != 0) {
					if (t == 1) {
						int s = sc.nextInt();
						speed += s;
					} else {
						int s = sc.nextInt();
						if (speed < t) {
							speed = 0;
						} else {
							speed -= s;
						}
					}
				}

				dist += speed;
			}
			System.out.println("#" + test_case + " " + dist);
		}
		sc.close();
	}
}