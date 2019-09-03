package by.htp.tasksolution;

/**
 * Найдите сумму двух матриц
 * 
 * @author s.kisel
 *
 */
public class Task38 {

	public static void main(String[] args) {
		int m = 6, n = 6;
		int[][] arrayA = new int[m][n];
		int[][] arrayB = new int[m][n];

		MassiveUtil.fillPositiveValues(arrayA, 9);
		MassiveUtil.print(arrayA);
		MassiveUtil.fillPositiveValues(arrayB, 9);
		MassiveUtil.print(arrayB);
		int[][] arrayC = MassiveUtil.getSum(arrayA, arrayB);
		MassiveUtil.print(arrayC);
	}
}
