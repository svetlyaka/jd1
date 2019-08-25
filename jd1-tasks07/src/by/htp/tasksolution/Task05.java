package by.htp.tasksolution;

/**
 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
 * 
 * @author s.kisel
 *
 */
public class Task05 {
	public static void main(String[] args) {

		int i = 5, j = 5;
		int[][] array = new int[i][j];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		MassiveUtil.printEvenRows(array);

	}
}
