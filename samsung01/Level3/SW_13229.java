import java.util.Scanner;

class SW_13229 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		String[] str = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		for (int test_case = 1; test_case <= T; test_case++) {
			String s = sc.next();
			int day = 0;
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals(s)) {
					day = i + 1;
					break;
				}
			}
			day = 7 - day;
			if (day == 0) {
				day = 7;
			}

			System.out.printf("#%d %s\n", test_case, day);
		}
		sc.close();
	}
}