package by.htp.tasksolution;

import java.util.Random;

public class MassiveUtil {

	public static void print(int[][] array) {
		if (array != null) {
			System.out.println("Array:");
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
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

	public static void printDiagonal(int[][] array) {
		System.out.print("Diagonal :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + " ");
		}
		System.out.println();
	}

	public static void printReverseDiagonal(int[][] array) {
		System.out.print("Reverse diagonal :");
		int length = array.length;
		for (int i = 0; i < length; i++) {
			System.out.print(array[i][length - 1 - i] + " ");
		}
		System.out.println();
	}

	public static int[][] getSum(int[][] arrayA, int[][] arrayB) {
		int[][] result = new int[arrayA.length][arrayA[0].length];
		if ((arrayA.length != arrayB.length) || (arrayA[0].length != arrayB[0].length)) {
			System.out.println("Arrays have diffrent dimensions");
			return null;
		} else {
			for (int i = 0; i < arrayA.length; i++) {
				for (int j = 0; j < arrayA[i].length; j++) {
					result[i][j] = arrayA[i][j] + arrayB[i][j];
				}
			}
			return result;
		}
	}

	/**
	 * Returns result of multiplication arrayA and arrayB or null if arrays have
	 * wrong dimensions
	 * 
	 * @param arrayA
	 * @param arrayB
	 * @return
	 */
	public static int[][] getMultiplication(int[][] arrayA, int[][] arrayB) {
		int[][] result = new int[arrayA.length][arrayA.length];
		if ((arrayA[0].length != arrayB.length)) {
			System.out.println("Arrays have wrong dimensions");
			return null;
		} else {
			int sum = 0;
			for (int i = 0; i < arrayA.length; i++) {
				for (int j = 0; j < arrayA.length; j++) {
					for (int z = 0; z < arrayA[0].length; z++) {
						sum += (arrayA[i][z] * arrayB[z][j]);
					}
					result[i][j] = sum;
					sum = 0;
				}

			}
			return result;
		}
	}

	public static int[][] mixRowsInArray(int[][] array) {
		int[] rowsOrder = new int[array.length];
		fillArrayAsRowsNumber(rowsOrder);
		mixValues(rowsOrder);
		int[][] result = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				result[rowsOrder[i]][j] = array[i][j];
			}
		}
		return result;
	}

	private static void mixValues(int[] array) {
		Random rand = new Random();
		int var;
		int random;
		for (int i = 0; i < array.length; i++) {
			random = rand.nextInt(array.length);
			var = array[i];
			array[i] = array[random];
			array[random] = var;

		}
	}

	private static void fillArrayAsRowsNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
}
