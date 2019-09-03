package by.htp.tasksolution;

/**
 * Найдите произведение двух матриц.
 * 
 * @author s.kisel
 *
 */
public class Task39 {

	public static void main(String[] args) {
		int m = 3, n = 3, maxRandomValue = 9;
		int[][] arrayA = new int[m][n];
		int[][] arrayB = new int[n][m];

		MassiveUtil.fillPositiveValues(arrayA, maxRandomValue);
		MassiveUtil.print(arrayA);
		MassiveUtil.fillPositiveValues(arrayB, maxRandomValue);
		MassiveUtil.print(arrayB);
		int[][] arrayC = MassiveUtil.getMultiplication(arrayA, arrayB);
		MassiveUtil.print(arrayC);
	}
}