import java.util.Scanner;

class SW_5607 {
	static long mo, ja;
	static long[] factorial;
	static final int mod = 1234567891;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int R = sc.nextInt();

			// 팩토리얼 값 저장(N,R)
			factorial = new long[1000001];
			factorial[0] = 1;
			for (int i = 1; i < 1000001; i++) {
				factorial[i] = (factorial[i - 1] * i) % mod;
			}

			ja = factorial[N] % mod;
			mo = ((factorial[R] % mod) * (factorial[N - R] % mod)) % mod;

			System.out.printf("#%d %s\n", test_case, (ja * pow(mo, mod - 2)) % mod);
		}
		sc.close();
	}

	private static long pow(long num, long n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return num;
		}
		long half = pow(num, n / 2);

		if (n % 2 == 0) {
			return ((half % mod) * (half % mod)) % mod;
		} else {
			return ((((half % mod) * (half % mod)) % mod) * num) % mod;
		}
	}
}