import java.util.Scanner;

class SW_7675 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] stop = { '.', '?', '!' }; // 멈추는 값을 int로 받기
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int count = 0;
			int[] result = new int[N];

			while (true) {
				if (count == N)
					break;
				String str = sc.next();
				if (65 <= str.charAt(0) && str.charAt(0) <= 90) {
					int ToF = 0;
					int len = str.length() - 1; // 문장 길이
					// 문장의 {'.', '?', '!'}이 포함될 경우 문자 하나 빼기
					if (str.charAt(len) == 33 || str.charAt(len) == 46 || str.charAt(len) == 63) {
						len--;
					}
					// 첫글자를 제외한 나머지가 소문자가 아닐경우 ToF(True or False)1
					for (int i = 1; i <= len; i++) {
						if (97 > str.charAt(i) || str.charAt(i) > 122) {
							ToF = 1;
							break;
						}
					}
					// ToF가 0이면 전부 소문자로 값 증가
					if (ToF == 0) {
						result[count]++;
					}
				}

				// 문장 마지막의 {'.', '?', '!'}이 있는 경우 count 증가
				for (int i = 0; i < 3; i++) {
					if (str.charAt(str.length() - 1) == stop[i]) {
						count++;
						break;
					}
				}
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < N; i++) {
				System.out.printf("%d ", result[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}