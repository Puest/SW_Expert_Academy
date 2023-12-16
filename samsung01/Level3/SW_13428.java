import java.util.Scanner;

class SW_13428 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			char[] N = sc.next().toCharArray();
			int Min = Integer.parseInt(String.valueOf(N));
			int Max = Min;

			for (int i = 0; i < N.length - 1; i++) {
				for (int j = i + 1; j < N.length; j++) {
					// 한 자리 변경
					char tmp = N[i];
					N[i] = N[j];
					N[j] = tmp;

					if (N[0] != 48 && Integer.parseInt(String.valueOf(N)) > Max) {
						Max = Integer.parseInt(String.valueOf(N));
					}
					if (N[0] != 48 && Integer.parseInt(String.valueOf(N)) < Min) {
						Min = Integer.parseInt(String.valueOf(N));
					}

					// 원상태로 변경
					tmp = N[i];
					N[i] = N[j];
					N[j] = tmp;
				}
			}
			System.out.printf("#%d %d %d\n", test_case, Min, Max);
		}
		sc.close();
	}
}