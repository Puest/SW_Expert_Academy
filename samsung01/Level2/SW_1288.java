import java.util.Scanner;

class SW_1288 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			boolean[] list = new boolean[10];
			int count = 0;
			int sum = 0;

			while (count < 10) {
				sum += N;
				String[] str = String.valueOf(sum).split("");
				for (String s : str) {
					int num = Integer.valueOf(s);
					if (!list[num]) {
						list[num] = true;
						count++;
					}
				}
			}

			System.out.println("#" + test_case + " " + sum);
		}
		sc.close();
	}
}