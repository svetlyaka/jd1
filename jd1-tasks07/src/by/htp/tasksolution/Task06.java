package by.htp.tasksolution;

/**
 * Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
 * элементов.
 * 
 * @author s.kisel
 *
 */
public class Task06 {

	public static void main(String[] args) {
		int i = 5, j = 5;
		int[][] array = new int[i][j];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		MassiveUtil.printOddColumnsWhereFirstElementIsMoreThanLast(array);
	}

}
