package by.htp.solution02;

import java.util.Scanner;

/**
 * ��������� ���������, ����������� ������ ���������� ���������� � �������
 * ��������. ��������� ����������� ��������� ����, ����� �����, ���������
 * �����������; ���� ����� �� ���������, �������� �� ������ ��������; ����
 * ����� ������� ������, ��� ����������, �� �������� ��������� ����� �
 * ��������� ����� �����; ���� ����� ������������, �� �������� ��������� �� ����
 * � ��������� ������ ����������� ���
 */
public class Task34 {

	public static void main(String[] args) {

		double costOfBook;
		double amountOfMoney;
		double result;
		System.out.print("Enter cost of books: ");
		Scanner sc = new Scanner(System.in);
		costOfBook = sc.nextDouble();
		System.out.print("Enter amount of money: ");
		amountOfMoney = sc.nextDouble();
		if (amountOfMoney == costOfBook) {
			System.out.println("Thank you");
		} else if (amountOfMoney > costOfBook) {
			result = amountOfMoney - costOfBook;
			System.out.println("Take the change: " + result);
		} else {
			result = costOfBook - amountOfMoney;
			System.out.println(String.format("Money is not enough, you need to add: %1$2s", result));
		}
		sc.close();
	}

}
