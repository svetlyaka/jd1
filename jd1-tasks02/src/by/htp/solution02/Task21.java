package by.htp.solution02;

import java.util.Scanner;

/**
 * ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ���
 * �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ���������
 * ����� ���� �������� �������!� ��� ���� �������� ��������!�.
 *
 */
public class Task21 {

	public static void main(String[] args) {
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
		x = sc.next();
		if (x.equals("�")) {
			System.out.println("��� �������� ��������!");
		} else if (x.equals("�")) {
			System.out.println("��� �������� �������!");
		}
		sc.close();
	}

}
