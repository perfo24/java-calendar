package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Calendar calendar = new Calendar();
		Scanner scanner = new Scanner(System.in);
		int year;
		int month;

		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(PROMPT);
			year = scanner.nextInt();
			if (year == -1)
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1)
				break;
			
			calendar.printCalendar(year, month);
		}

		System.out.println("Bye~");

		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
