import java.util.Scanner;

class SW_6485 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			int Arr[] = new int[N];
			int Brr[] = new int[N];
			for (int i = 0; i < N; i++) {
				Arr[i] = sc.nextInt();
				Brr[i] = sc.nextInt();
			}

			int P = sc.nextInt();
			int[] C = new int[P];
			for (int i = 0; i < P; i++) {
				C[i] = sc.nextInt();
			}

			int[] list = new int[P];
			for (int i = 0; i < C.length; i++) {
				int count = 0;
				for (int j = 0; j < N; j++) {
					if (Arr[j] <= C[i] && C[i] <= Brr[j]) {
						count++;
					}
				}
				list[i] = count;
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < P; i++) {
				System.out.printf("%d ", list[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}