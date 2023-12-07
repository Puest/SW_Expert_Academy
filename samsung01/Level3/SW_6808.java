import java.util.Scanner;

class SW_6808 {
	static int win, lose;
	static int[] guCard, inCard;

	static boolean[] check;
	static int[] result;

	static int count;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			// 규영이 덱
			guCard = new int[9];
			boolean[] Cards = new boolean[19];
			for (int i = 0; i < 9; i++) {
				guCard[i] = sc.nextInt();
				Cards[guCard[i]] = true;
			}

			// 인영이 덱
			int idx = 0;
			inCard = new int[9];
			for (int i = 1; i < 19; i++) {
				if (!Cards[i]) {
					inCard[idx] = i;
					idx++;
				}
			}

			check = new boolean[9];
			result = new int[9];
			count = 0;
			dfs(0);
			System.out.printf("#%d %d %d\n", test_case, count, 362880 - count);
		}
		sc.close();
	}

	public static void dfs(int depth) {
		if (depth == 9) {
			int guScore = 0;
			int inScore = 0;

			for (int i = 0; i < 9; i++) {
				if (guCard[i] > result[i]) {
					guScore += guCard[i] + result[i];
				} else {
					inScore += guCard[i] + result[i];
				}

			}

			if (guScore > inScore)
				count++;
			return;
		}

		for (int i = 0; i < 9; i++) {
			if (!check[i]) {
				result[depth] = inCard[i];
				check[i] = true;
				dfs(depth + 1);
				check[i] = false;
			}
		}
	}
}