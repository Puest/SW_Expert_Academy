import java.util.Scanner;

class SW_4047 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			boolean charm = true;
			String S = sc.next();
			int[] cl = { 13, 13, 13, 13 };
			for (int i = 0; i < S.length(); i += 3) {
				String deck = S.substring(i, i + 3);
				for (int k = i + 3; k < S.length(); k += 3) {
					String deck2 = S.substring(k, k + 3);
					if (deck.equals(deck2)) {
						System.out.printf("#%d ERROR\n", test_case);
						charm = false;
						break;
					}
				}

				if (deck.startsWith("S")) {
					cl[0]--;
				} else if (deck.startsWith("D")) {
					cl[1]--;
				} else if (deck.startsWith("H")) {
					cl[2]--;
				} else {
					cl[3]--;
				}
			}

			if (charm) {
				System.out.printf("#%d ", test_case);
				for (int i = 0; i < cl.length; i++) {
					System.out.printf("%d ", cl[i]);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}