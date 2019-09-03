package by.htp.tasksolution;

import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * 
 * @author s.kisel
 *
 */
public class Task10 {

	public static void main(String[] args) {
		int i = 6;
		int[][] array = new int[i][i];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row number:");
		int k = sc.nextInt();
		MassiveUtil.printRow(array, k);
		System.out.println("Enter column number:");
		int p = sc.nextInt();
		MassiveUtil.printColumn(array, p);
		sc.close();
	}

}
