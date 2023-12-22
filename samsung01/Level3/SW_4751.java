import java.util.Scanner;

class SW_4751 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String N = sc.next();
			String str1 = "";
			String str2 = "";
			String str3 = "";

			for (int i = 0; i < N.length(); i++) {
				str1 += "..#.";
				str2 += ".#.#";
				str3 += "#." + N.charAt(i) + ".";
			}
			str1 += ".";
			str2 += ".";
			str3 += "#";

			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			System.out.println(str2);
			System.out.println(str1);

		}
		sc.close();
	}
}