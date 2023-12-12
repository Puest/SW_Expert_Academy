import java.util.Scanner;

class SW_5356 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String result = "";

			String[] str = new String[5];
			for (int i = 0; i < 5; i++) {
				str[i] = sc.next();
			}

			int lmax = 0; // 배열 중 가장 긴 문자열 길이
			for (String s : str) {
				lmax = Math.max(s.length(), lmax);
			}

			for (int i = 0; i < lmax; i++) {
				for (int k = 0; k < 5; k++) {
					if (str[k].length() > i) {
						result += str[k].charAt(i);
					}
				}
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}
//Aa0FfBb1GgCc2HhDd3IiEe4Jj
//Aa0FfBb1GgCc2HhDd3IiEe4Jj