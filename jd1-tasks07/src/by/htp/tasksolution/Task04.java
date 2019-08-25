package by.htp.tasksolution;

/**
 * Дана матрица. Вывести на экран первую и последнюю строки.
 * 
 * @author s.kisel
 *
 */
public class Task04 {
	public static void main(String[] args) {

		int i = 4, j = 5;
		int[][] array = new int[i][j];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		MassiveUtil.printRow(array, 0);
		MassiveUtil.printRow(array, array.length - 1);
	}
}
