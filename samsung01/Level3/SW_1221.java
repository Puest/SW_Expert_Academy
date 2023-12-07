import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class SW_1221 {
	public static void main(String args[]) throws Exception {
		HashMap<String, Integer> map = new HashMap<>();
		String[] anum = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };
		for (int i = 0; i < anum.length; i++) {
			map.put(anum[i], i);
		}

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int NL = sc.nextInt();
			int[] N = new int[NL];
			for (int i = 0; i < NL; i++) {
				N[i] = map.get(sc.next());
			}
			Arrays.sort(N);

			System.out.printf("%s\n", str);
			for (int i = 0; i < NL; i++) {
				System.out.printf("%s ", anum[N[i]]);
			}
			System.out.println();
		}
		sc.close();
	}
}