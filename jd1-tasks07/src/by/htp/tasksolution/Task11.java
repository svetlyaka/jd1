package by.htp.tasksolution;

/**
 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
 * строка справа налево, вторая строка слева направо, третья строка справа
 * налево и так далее.
 * 
 * @author s.kisel
 *
 */
public class Task11 {

	public static void main(String[] args) {
		int m = 6, n = 5;
		;
		int[][] array = new int[m][n];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);

	}
}
