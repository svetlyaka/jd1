package task03;

/*
 *  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 
 *  до введенного пользователем числа. 
 */
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		int min = 1, max, i, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		max = scan.nextInt();
		i = min;
		while (i <= max) {
			result += i;
			i++;
		}
		System.out.println("Result: " + result);
		scan.close();
	}

}
