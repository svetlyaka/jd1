package by.htp.solution02;

import java.util.Scanner;

/**
 * ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31,
 * ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
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
