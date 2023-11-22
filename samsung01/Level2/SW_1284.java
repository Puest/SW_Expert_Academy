import java.util.Scanner;

class SW_1284 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int P = sc.nextInt(); // A사
			int Q = sc.nextInt(); // B사 기본 요금
			int R = sc.nextInt(); // 월간 사용 가능 양
			int S = sc.nextInt(); // B사 추가요금(L)
			int W = sc.nextInt(); // 한달 사용 수도 양(L)

			int A = P * W;
			int B = Q;
			if (R < W) {
				B = Q + (W - R) * S;
			}
			
			int result = A > B ? B : A;
			System.out.println("#" + test_case + " " + result);
		}
		sc.close();
	}
}