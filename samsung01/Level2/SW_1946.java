import java.util.Scanner;

class SW_1946 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			String[] str = new String[N];
			int[] itr = new int[N];
			int num = 0;
			for (int i = 0; i < N; i++) {
				str[i] = sc.next();
				itr[i] = sc.nextInt();
				num += itr[i];
			}

			int idx = 0;
			String[] s = new String[num];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < itr[i]; j++) {
					s[idx] = str[i];
					idx++;
				}
			}

			System.out.println("#" + test_case);
			for (int i = 0; i < idx; i++) {
				if (i != 0 && i % 10 == 0) {
					System.out.println();
				}
				System.out.print(s[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}