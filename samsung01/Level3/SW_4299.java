import java.util.Calendar;
import java.util.Scanner;

class SW_4299 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			Calendar cal = Calendar.getInstance(); // 소개팅 시간
			cal.set(2011, 11, 11, 11, 11); // 2011년 11월 11일 오전 11시 11분 설정

			int D = sc.nextInt(); // 일
			int H = sc.nextInt(); // 시
			int M = sc.nextInt(); // 분
			Calendar cal2 = Calendar.getInstance(); // 깨딸음 시간
			cal2.set(2011, 11, D, H, M); // 2011년 11월 D일 A.M./P.M. H시 M분 설정

			long result = cal2.getTimeInMillis() - cal.getTimeInMillis();
			if (result < 0) {
				System.out.printf("#%d %d\n", test_case, -1);
			} else {
				System.out.printf("#%d %d\n", test_case, result / (60 * 1000));
			}

		}
		sc.close();
	}
}