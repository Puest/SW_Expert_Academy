import java.util.Scanner;

class SW_1289 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String[] N = sc.next().split("");

			int cnt = 0;
			String splt = "0";
			for (int i = 0; i < N.length; i++) {
				if (N[i].equals("1") && splt.equals("0")) {
					cnt++;
					splt = "1";
				} else if (N[i].equals("0") && splt.equals("1")) {
					cnt++;
					splt = "0";
				}
			}
			System.out.printf("#%d %d\n", test_case, cnt);
		}
		sc.close();
	}
}