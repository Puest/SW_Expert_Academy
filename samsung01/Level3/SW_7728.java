import java.util.LinkedList;
import java.util.Scanner;

class SW_7728 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int count = 0;
			LinkedList<Character> list = new LinkedList<>();

			for (int i = 0; i < str.length(); i++) {
				if (!list.contains(str.charAt(i))) {
					count++;
					list.add(str.charAt(i));
				}
			}

			System.out.printf("#%d %s\n", test_case, count);
		}
		sc.close();
	}
}