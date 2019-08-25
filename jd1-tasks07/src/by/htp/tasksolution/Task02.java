package by.htp.tasksolution;

/**
 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
 * [0, 9].
 * 
 * @author s.kisel
 *
 */
public class Task02 {

	public static void main(String[] args) {
		int i = 2, j = 3;
		int[][] array = new int[i][j];

		MassiveUtil.fillPositiveValues(array, 9);
		MassiveUtil.print(array);
	}

}
