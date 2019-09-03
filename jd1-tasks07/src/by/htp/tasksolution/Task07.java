package by.htp.tasksolution;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
 * больше последнего.
 * 
 * @author s.kisel
 *
 */
public class Task07 {

	public static void main(String[] args) {
		int i = 4, j = 5;
		int[][] array = new int[i][j];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
		MassiveUtil.printOddColumnsWhereFirstElementIsMoreThanLast(array);
	}

}
