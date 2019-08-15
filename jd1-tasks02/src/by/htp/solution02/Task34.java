package by.htp.solution02;

import java.util.Scanner;

/**
 * Составить программу, реализующую эпизод применения компьютера в книжном
 * магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
 * покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
 * денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
 * и указывает размер недостающей сум
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
