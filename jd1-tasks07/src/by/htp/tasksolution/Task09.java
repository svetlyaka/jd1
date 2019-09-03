package by.htp.tasksolution;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 * 
 * @author s.kisel
 *
 */
public class Task09 {

	public static void main(String[] args) {
		int i = 6;
		int[][] array = new int[i][i];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		MassiveUtil.printDiagonal(array);
		MassiveUtil.printReverseDiagonal(array);
	}

}
