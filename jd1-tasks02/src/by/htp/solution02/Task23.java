package by.htp.solution02;

import java.util.Scanner;

/**
 * ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31,
 * мес€ц Ч от 1 до 12). ≈сли введены некорректные данные, то сообщить об этом.
 *
 */
public class Task23 {

	public static void main(String[] args) {
		int month, day;
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month: ");
		month = sc.nextInt();
		System.out.print("Enter day: ");
		day = sc.nextInt();
		if ((month > months.length) || (month < 1)) {
			System.out.print("Entered invalid data: month");
		} else if ((day < 0) || (months[month - 1] < day)) {
			System.out.print("Entered invalid data: day");
		}
		sc.close();
	}

}
