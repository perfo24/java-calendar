package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Calendar calendar = new Calendar();
		Scanner scanner = new Scanner(System.in);
		int year;
		int month;
		String weekday;

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
			
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
			System.out.print(PROMPT);
			weekday = scanner.next();
			if (Integer.parseInt(weekday) == -1)
				break;
			
			calendar.printCalendar(year, month, weekday);
		}

		System.out.println("Bye~");

		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
