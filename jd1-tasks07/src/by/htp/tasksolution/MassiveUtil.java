package by.htp.tasksolution;

import java.util.Random;

public class MassiveUtil {

	public static void print(int[][] array) {
		System.out.println("Array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void fillValues(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i != j) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
				}
			}
		}
	}

	public static void fillPositiveValues(int[][] array, int max) {
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt(max + 1);
			}
		}
	}

	public static void fillRandomValues(int[][] array, int max) {
		int index = 0;
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (rn.nextInt(1) == 0) {
					index = 1;
				} else {
					index = -1;
				}
				array[i][j] = rn.nextInt(max + 1) * index;
			}
		}
	}

	public static void printColumn(int[][] array, int j) {
		System.out.println(String.format("Column %d:", j));
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][j]);
		}
	}

	public static void printRow(int[][] array, int i) {
		System.out.println(String.format("Row %d:", i));
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j] + "\t");
		}
		System.out.println();
	}

	public static void printEvenRows(int[][] array) {
		System.out.println("Print even rows:");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}

	public static void printOddColumnsWhereFirstElementIsMoreThanLast(int[][] array) {
		System.out.println("Print odd columns where first element is more than last:");
		for (int j = 0; j < array[0].length; j++) {
			if (j % 2 == 1 && (array[0][j] > array[array.length - 1][j])) {
				System.out.println(String.format("Column %d:", j));
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i][j]);
				}
			}
		}
	}
}
