package by.htp.solution02;

import java.util.Scanner;

/**
 * Вычислить число и месяц в невисокосном году по номеру дня.
 *
 */
public class Task35 {

	public static void main(String[] args) {

		int day;
		String monthName = null;
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String monthesNames[] = { "January", "Fabruary", "March", "Aptil", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day number: ");
		day = sc.nextInt();

		for (int i = 0; i <= 11; i++) {
			if (day <= month[i]) {
				monthName = monthesNames[i];
				break;
			} else {
				day -= month[i];
			}
		}
		System.out.print("Month: " + monthName + " Day: " + day);
		sc.close();
	}
}
