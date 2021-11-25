package calendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "> ";

	public void printHint() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}

	public void runPrompt() {
		Calendar calendar = new Calendar();
		String date, schedule;
		HashMap<String, ArrayList<String>> dateSchedule = new HashMap<String, ArrayList<String>>();

		Scanner scanner = new Scanner(System.in);

		printHint();

		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print(PROMPT);
			String text = scanner.nextLine();
			if (text.equals("q"))
				break;
			switch (text) {
			case "1":
				System.out.println("[일정 등록] 날짜를 입력하세요.(YYYY-MM-DD)");
				System.out.print(PROMPT);
				date = scanner.nextLine();
				System.out.println("일정을 입력하세요.");
				System.out.print(PROMPT);
				schedule = scanner.nextLine();
				if (dateSchedule.get(date) == null) {
					ArrayList<String> scheduleList = new ArrayList<String>();
					scheduleList.add(schedule);
					dateSchedule.put(date, scheduleList);
				} else {
					dateSchedule.get(date).add(schedule);
				}
				System.out.println("일정이 등록되었습니다.");
				break;
			case "2":
				System.out.println("[일정 검색] 날짜를 입력하세요.(YYYY-MM-DD)");
				System.out.print(PROMPT);
				date = scanner.nextLine();
				ArrayList<String> scheduleList = dateSchedule.get(date);
				if (scheduleList == null) {
					System.out.println("일정이 없습니다.");
				} else {
					System.out.printf("%d개의 일정이 있습니다.\n", scheduleList.size());
					int i = 1;
					for (String s : scheduleList) {
						System.out.printf("%d. %s\n", i, s);
					}
				}

				break;
			case "3":
				System.out.println("년도를 입력하세요.");
				System.out.print(PROMPT);
				int year = scanner.nextInt();

				System.out.println("달을 입력하세요.");
				System.out.print(PROMPT);
				int month = scanner.nextInt();

				calendar.printCalendar(year, month);
				break;
			case "h":
				printHint();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

		System.out.println("Bye");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
