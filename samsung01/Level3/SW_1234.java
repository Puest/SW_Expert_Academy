import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class SW_1234 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			String str = sc.next();
			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < N; i++) {
				char ch = str.charAt(i);

				if (stack.isEmpty() || stack.peek() != ch) {
					stack.add(ch);
				} else {
					stack.pop();
				}
			}

			LinkedList<Object> list = new LinkedList<>();
			while (!stack.isEmpty()) {
				list.add(stack.pop());
			}

			Collections.reverse(list);

			System.out.printf("#%d ", test_case);
			while (!list.isEmpty()) {
				System.out.printf("%s", list.peek());
				list.poll();
			}
			System.out.println();
		}
		sc.close();
	}
}