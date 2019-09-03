package by.htp.tasksolution;

/**
 * Переставить строки матрицы случайным образом.
 * 
 * @author s.kisel
 *
 */
public class Task37 {

	public static void main(String[] args) {
		int m = 3, n = 3, maxRandomValue = 9;
		int[][] array = new int[m][n];

		MassiveUtil.fillPositiveValues(array, maxRandomValue);
		MassiveUtil.print(array);
		int[][] arrayCopy = MassiveUtil.mixRowsInArray(array);
		array = arrayCopy;
		MassiveUtil.print(array);
	}
}