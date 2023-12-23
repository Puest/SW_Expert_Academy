import java.util.Arrays;
import java.util.Scanner;

class SW_14361 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			long N = sc.nextLong();
			String[] Ns = String.valueOf(N).split("");
			Arrays.sort(Ns);
			int nlen = Ns.length;
			String result = "impossible";

			long value = N;
			int i = 2;
			while (true) {
				value = N * i;
				i++;
				int vlen = String.valueOf(value).length();
				String[] str = String.valueOf(value).split("");

				if (vlen != nlen) {
					break;
				}

				int cnt = 0;
				Arrays.sort(str);
				for (int j = 0; j < str.length; j++) {
					if (Ns[j].equals(str[j])) {
						cnt++;
					}
				}
				if (cnt == str.length) {
					result = "possible";
				}
			}

			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}