package by.htp.solution02;

import java.util.Scanner;

/**
 * Написать программу, которая по паролю будет определять уровень доступа
 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
 *
 */
public class Task33 {
	public static void main(String[] args) {
		int password;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter password: ");
		password = scan.nextInt();
		if (password == 9583 || password == 1747) {
			System.out.println("You have access to BD A, B, C");
		} else if (password == 3331 || password == 7922) {
			System.out.println("You have access to BD B, C");
		} else if (password == 9455 || password == 8997) {
			System.out.println("You have access to BD C");
		}
		scan.close();
	}

}
