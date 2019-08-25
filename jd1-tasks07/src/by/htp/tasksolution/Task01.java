package by.htp.tasksolution;

/**
 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
 * была ровно одна единица, и вывести на экран.
 * 
 * @author s.kisel
 *
 */
public class Task01 {

	public static void main(String[] args) {
		int i = 3, j = 4;
		int[][] array = new int[i][j];

		MassiveUtil.fillValues(array);
		MassiveUtil.print(array);
	}

}
