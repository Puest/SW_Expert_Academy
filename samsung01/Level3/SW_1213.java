import java.util.Scanner;

class SW_1213 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 1; test_case++) {
			int T = sc.nextInt();
			String str = sc.next();
			String split = sc.next();

			int count = 0;
			String sp = split.replace(str, "|");
			String[] ss = sp.split("");
			for (int i = 0; i < ss.length; i++) {
				if (ss[i].equals("|")) {
					count++;
				}
			}

			System.out.printf("#%d %d\n", T, count);
		}
		sc.close();
	}
}