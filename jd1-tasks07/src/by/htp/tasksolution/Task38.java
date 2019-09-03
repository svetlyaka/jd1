package by.htp.tasksolution;

/**
 * Найдите сумму двух матриц
 * 
 * @author s.kisel
 *
 */
public class Task38 {

	public static void main(String[] args) {
		int m = 6, n = 6, maxRandomValue = 9;
		int[][] arrayA = new int[m][n];
		int[][] arrayB = new int[m][n];

		MassiveUtil.fillPositiveValues(arrayA, maxRandomValue);
		MassiveUtil.print(arrayA);
		MassiveUtil.fillPositiveValues(arrayB, maxRandomValue);
		MassiveUtil.print(arrayB);
		int[][] arrayC = MassiveUtil.getSum(arrayA, arrayB);
		MassiveUtil.print(arrayC);
	}
}
