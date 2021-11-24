package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		int n1, n2;
		n1 = Integer.parseInt(s1);
		n2 = Integer.parseInt(s2);
		

		System.out.println("두 수의 합은 " + (n1 + n2) + "입니다.");

		scanner.close();
	}
}
