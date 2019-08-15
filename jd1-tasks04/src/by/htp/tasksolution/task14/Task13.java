
package by.htp.tasksolution.task14;

import java.util.Scanner;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 *
 */
public class Task13 {

	public static void mail(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		number = scan.nextInt();
		System.out.println(getNumber(number));
		scan.close();
	}

	public static int getNumber(int value) {
		int result = 0;
		while (value > 0) {
			value /= 10;
			System.out.println(value);
			result++;
		}
		return result;

	}

}
