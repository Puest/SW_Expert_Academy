import java.time.LocalDate;
import java.util.Scanner;

class SW_5515 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			LocalDate ldt = LocalDate.of(2016, sc.nextInt(), sc.nextInt());
			int daty = ldt.getDayOfWeek().getValue();

			System.out.printf("#%d %d\n", test_case, daty - 1);
		}
		sc.close();
	}
}