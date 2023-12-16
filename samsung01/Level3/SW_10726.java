import java.util.Scanner;

class SW_10726 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			String[] bin = Integer.toBinaryString(M).split("");
			int count = 0;
			for (int i = bin.length - 1; i >= bin.length - N; i--) {
				if (bin.length < N)
					break;
				if (bin[i].equals("1")) {
					count++;
				}
			}

			if (count == N) {
				System.out.printf("#%d %s\n", test_case, "ON");
			} else {
				System.out.printf("#%d %s\n", test_case, "OFF");
			}

		}
		sc.close();
	}
}