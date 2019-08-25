package by.htp.tasksolution;

/**
 * Дана матрица. Вывести на экран первый и последний столбцы.
 * 
 * @author s.kisel
 *
 */
public class Task03 {

	public static void main(String[] args) {
		int i = 4, j = 5;
		int[][] array = new int[i][j];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		MassiveUtil.printColumn(array, 0);
		MassiveUtil.printColumn(array, array[0].length - 1);
	}

}
