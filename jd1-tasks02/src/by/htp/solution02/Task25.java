package by.htp.solution02;

import java.util.Scanner;

/**
 * �������� ��������� � ������ ������� ��������� ������� � ���������, �������
 * ������� ��������� �������������� �������� �, ���� ����������� � �������
 * ��������� 60� �.
 *
 */
public class Task25 {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter t: ");
		t = sc.nextInt();
		if (t > 60) {
			System.out.println("������������� ��������");
		}
		sc.close();
	}

}
