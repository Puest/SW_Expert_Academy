import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class SW_5948 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			LinkedList<Integer> list = new LinkedList<>();
			int[] nlist = new int[7];
			for (int i = 0; i < 7; i++) {
				nlist[i] = sc.nextInt();
			}

			for (int i = 0; i < 7; i++) {
				for (int j = i + 1; j < 7; j++) {
					for (int k = j + 1; k < 7; k++) {
						int sum = nlist[i] + nlist[j] + nlist[k];
						if (!list.contains(sum)) {
							list.add(sum);
						}

					}
				}
			}
			list.sort(Collections.reverseOrder());

			System.out.printf("#%d %d\n", test_case, list.get(4));
		}
		sc.close();
	}
}