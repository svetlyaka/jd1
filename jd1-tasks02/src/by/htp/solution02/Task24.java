package by.htp.solution02;

import java.util.Scanner;

/**
 * ��������� ���������, ������������ ��������� ������� �� ������� � ��������
 * �����, ���� �� �������� ������ ���������� ��������� �.
 *
 */
public class Task24 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.print("�����");
		} else {
			System.out.print("�� �2����");
		}
		sc.close();
	}

}
