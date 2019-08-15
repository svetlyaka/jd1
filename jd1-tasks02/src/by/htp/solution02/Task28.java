package by.htp.solution02;

import java.util.Scanner;

/**
 * ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� ��
 * ����� d, �� ����� max(d � a, d � b, d � c).
 */
public class Task28 {
	public static void main(String[] args) {
		int a, b, c, d = 100, result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
		System.out.print("Enter c: ");
		c = sc.nextInt();
		if (a == d) {
			System.out.println("The a number is equal d");
		} else if (b == d) {
			System.out.println("The b number is equal d");
		} else if (c == d) {
			System.out.println("The c number is equal d");
		} else {
			result = MathUtils.getMax(d - a, MathUtils.getMax(d - b, d - c));
			System.out.println("max(d � a, d � b, d � c) is " + result);
		}
		sc.close();
	}

}
