package task03;

/**
 * Составить программу нахождения разности кубов первых двухсот чисел
 *
 */
public class Task11 {

	public static void main(String[] args) {
		int result = 0, min = 1, max = 200, power = 3;
		for (int i = min; i <= max; i++) {
			result -= Math.pow(i, power);
		}
		System.out.println("Result: " + result);
	}

}
