package by.htp.solution02;

import java.util.Scanner;

/**
 * �������� ���������, ������� �� ������ ����� ���������� ������� �������
 * ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������
 * ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ���������
 * ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � ��������
 * ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.
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
