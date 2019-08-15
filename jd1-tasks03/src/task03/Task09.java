package task03;

/**
 * Найти сумму квадратов первых ста чисел.
 *
 */
public class Task09 {

	public static void main(String[] args) {
		int result = 0, min = 1, max = 100;
		for (int i = min; i <= max; i++) {
			result += Math.pow(i, 2);
		}
		System.out.println("Result: " + result);
	}

}
