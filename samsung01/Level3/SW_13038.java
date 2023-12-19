import java.util.Scanner;

class SW_13038 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			// n일 동안 수업(= 값이 1인 해당 요일에 수업을 n일 들으라는 소리인 것 같다.)
			int N = sc.nextInt(); // n일
			int[] lesson = new int[7];
			for (int i = 0; i < 7; i++) {
				lesson[i] = sc.nextInt();
			}

			int mday = Integer.MAX_VALUE;
			for (int i = 0; i < 7; i++) {
				int start = 0;
				int cnt = 0; // 초기화 된 날로부터 n일까지 세기
				if (lesson[i] == 1) {
					start = i; // 시작 날짜 초기화
					while (true) {
						if (lesson[start % 7] == 1) {
							cnt++;
						}
						start++;
						if (cnt == N) {
							mday = Integer.min(mday, start - i);
							break;
						}
					}
				}
			}

			System.out.printf("#%d %d\n", test_case, mday);
		}
		sc.close();
	}
}